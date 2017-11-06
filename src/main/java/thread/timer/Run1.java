package thread.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Yang on 2017/10/20 0020.
 */
public class Run1 {
    private static Timer timer = new Timer(true);
    static public class MyTask extends TimerTask {
        @Override
        public void run(){
            System.out.println("运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2017-10-20 14:36:00";
            Date dateRef = sdf.parse(dateString);
            while (dateRef.after(new Date())){
                System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toLocaleString());
                Thread.sleep(1000);
            }
            timer.schedule(task,dateRef);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
