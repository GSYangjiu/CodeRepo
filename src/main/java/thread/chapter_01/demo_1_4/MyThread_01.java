package thread.chapter_01.demo_1_4;

/**
 * Created by Yang.
 * Date  : 2018-03-28
 * Time  : 15:25
 * Email : vincent1094259423@yahoo.com
 * Description:
 */
public class MyThread_01 extends Thread {
    @Override
    public void run() {
        System.out.println("run = " + this.isAlive());
    }
}
