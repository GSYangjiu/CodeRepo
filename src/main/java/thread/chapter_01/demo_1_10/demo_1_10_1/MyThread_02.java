package thread.chapter_01.demo_1_10.demo_1_10_1;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-29 14:11
 * Description:
 */
public class MyThread_02 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread_02 run priority = " + this.getPriority());
    }
}
