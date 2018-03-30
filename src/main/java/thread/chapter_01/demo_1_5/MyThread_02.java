package thread.chapter_01.demo_1_5;

/**
 * Created by Yang.
 * Date  : 2018-03-28
 * Time  : 15:38
 * Email : vincent1094259423@yahoo.com
 * Description:
 */
public class MyThread_02 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName=" + this.currentThread().getName() + " begin =" + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName=" + this.currentThread().getName() + " end =" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
