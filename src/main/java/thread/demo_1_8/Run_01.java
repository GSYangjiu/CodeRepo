package thread.demo_1_8;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-28 18:23
 * Description:
 */
public class Run_01 {
    public static void main(String[] args) {
        try {
            MyThread_01 thread = new MyThread_01();
            thread.start();
            Thread.sleep(5000);
            //A段
            thread.suspend();
            System.out.println("A= " + System.currentTimeMillis() + " i=" + thread.getI());
            Thread.sleep(5000);
            System.out.println("A= " + System.currentTimeMillis() + " i=" + thread.getI());

            //B段
            thread.resume();
            Thread.sleep(5000);

            //C段
            thread.suspend();
            System.out.println("B= " + System.currentTimeMillis() + " i=" + thread.getI());
            Thread.sleep(5000);
            System.out.println("B= " + System.currentTimeMillis() + " i=" + thread.getI());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
