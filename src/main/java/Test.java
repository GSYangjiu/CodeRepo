/**
 * Created by Yang on 2017/10/25 0025.
 */
public class Test {
    private static boolean stopRequested;


    public static void main(String[] args) throws InterruptedException {
        //long totalMilliSeconds =  15282746498L;
        long totalMilliSeconds =  System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;

        //求出现在的秒
        long currentSecond = totalSeconds % 60;

        //求出现在的分
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        //求出现在的小时
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;

        //显示时间
        System.out.println("总毫秒为： " + totalMilliSeconds);
        System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}

//while(!done) i+++;  --> if(!done) {while(true) i+++}