package thread.demo_1_7;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-28 16:54
 * Description:
 */
public class Run_03 {
    public static void main(String[] args) {
        try {
            MyThread_03 thread = new MyThread_03();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
