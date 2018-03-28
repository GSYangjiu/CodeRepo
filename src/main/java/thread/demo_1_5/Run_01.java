package thread.demo_1_5;

/**
 * Created by Yang.
 * Date  : 2018-03-28
 * Time  : 15:34
 * Email : vincent1094259423@yahoo.com
 * Description:
 */
public class Run_01 {
    public static void main(String[] args) {
        MyThread_01 myThread = new MyThread_01();
        System.out.println("begin = " + System.currentTimeMillis());
        myThread.run();
        System.out.println("end = " + System.currentTimeMillis());
    }
}
