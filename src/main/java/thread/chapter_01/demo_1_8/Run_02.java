package thread.chapter_01.demo_1_8;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-29 11:14
 * Description:
 */
public class Run_02 {
    public static void main(String[] args) {
        try {
            MyThread_02 thread = new MyThread_02();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
