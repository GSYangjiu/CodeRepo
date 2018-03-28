package thread.demo_1_5;

/**
 * Created by Yang.
 * Date  : 2018-03-28
 * Time  : 15:39
 * Email : vincent1094259423@yahoo.com
 * Description:
 */
public class Run_02 {
    public static void main(String[] args) {
        MyThread_02 myThread = new MyThread_02();
        System.out.println("begin =" + System.currentTimeMillis());
        myThread.start();
        System.out.println("end  =" + System.currentTimeMillis());
    }
}
