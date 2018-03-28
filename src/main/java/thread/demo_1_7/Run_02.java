package thread.demo_1_7;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-28 16:24
 * Description:
 */
public class Run_02 {
    public static void main(String[] args) {
        try {
            MyThread_02 thread = new MyThread_02();
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
