package utils.uniqId;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author lx
 */
public class UniqId {
	private static char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	private static Map<Character, Integer> rDigits = new HashMap<Character, Integer>(10);
	static {
		for (int i = 0; i < digits.length; ++i) {
			rDigits.put(digits[i], i);
		}
	}
	private static UniqId me = new UniqId();
	private String hostAddr;
	private Random random = new SecureRandom();
	private UniqLong uniqLong = new UniqLong();
	private String processId;
	private Map<String, AtomicLong> map = new HashMap<String,AtomicLong>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	
	
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0 ; i<10000;i++){
			Thread.sleep(new Random().nextInt(10));
			System.out.println(UniqId.getInstance().getSerialNumber());
		}
	}
	
	public String getSerialNumber(){
		Calendar c =  Calendar.getInstance();
		String key = sdf.format(c.getTime());
		if(map.get(key) == null){
			map.clear();
			AtomicLong l = new AtomicLong(10000);
			map.put(key, l);
		}
		
		StringBuffer sb = new StringBuffer();
		long t = getUniqValue();
		sb.append(key);
		sb.append(hostAddr.substring(hostAddr.lastIndexOf(".") + 1));
		sb.append(processId);
		sb.append(t);
		sb.append(random.nextInt(10));
		sb.append(map.get(key).incrementAndGet());
		return sb.toString();
		
	}

	private UniqId() {
		try {
			InetAddress addr = getAddress();
			hostAddr = addr.getHostAddress();
		} catch (Exception e) {
			hostAddr = String.valueOf(System.currentTimeMillis());
		}
		if (hostAddr == null || hostAddr.length() == 0 || "127.0.0.1".equals(hostAddr)) {
			hostAddr = String.valueOf(System.currentTimeMillis());
		}
		String name = ManagementFactory.getRuntimeMXBean().getName();
		processId = name.split("@")[0];
	}

	private InetAddress getAddress() {
		InetAddress ipAddress = null;
		try {
			// 如果是Windows操作系统
			String os = System.getProperty("os.name");
			if (os.toLowerCase().startsWith("win") || os.toLowerCase().startsWith("mac")) {
				ipAddress = InetAddress.getLocalHost();
			}else if (os.toLowerCase().startsWith("linux")) {
				boolean bFindIP = false;
				Enumeration<NetworkInterface> netInterfaces = (Enumeration<NetworkInterface>) NetworkInterface.getNetworkInterfaces();
				while (netInterfaces.hasMoreElements()) {
					if (bFindIP) {
						break;
					}
					NetworkInterface ni = (NetworkInterface) netInterfaces.nextElement();
					// 特定情况，可以考虑用ni.getName判断
					// 遍历所有ip
					Enumeration<InetAddress> ips = ni.getInetAddresses();
					while (ips.hasMoreElements()) {
						ipAddress = (InetAddress) ips.nextElement();
						// 127.开头的都是lookback地址
						if (ipAddress.isSiteLocalAddress() && !ipAddress.isLoopbackAddress() && ipAddress.getHostAddress().indexOf(":") == -1) {
							bFindIP = true;
							break;
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ipAddress;
	}

	/**
	 * 获取UniqID实例
	 * 
	 * @return UniqId
	 */
	public static UniqId getInstance() {
		return me;
	}

	/**
	 * 获得不会重复的毫秒数
	 * 
	 * @return
	 */
	private long getUniqValue() {
		return uniqLong.getCurrent();
	}

	/**
	 * 获得UniqId
	 * 
	 * @return uniqTime-randomNum-hostAddr-threadId
	 */
	public String getUniqID() {
		StringBuffer sb = new StringBuffer();
		long t = getUniqValue();
		sb.append(hostAddr.substring(hostAddr.lastIndexOf(".") + 1));
		sb.append(processId);
		sb.append(t);
		sb.append(random.nextInt(10));
		return sb.toString();
	}

	/**
	 * 实现不重复的时间
	 * 
	 * @author dogun
	 */
	private static class UniqLong {
	    
	    private String time = System.currentTimeMillis()+"";
        private AtomicLong last = new AtomicLong(Long.parseLong(time.substring(time.length()-4, time.length())));
      
		public long getCurrent() {
			return this.last.incrementAndGet();
		}
	}

}
