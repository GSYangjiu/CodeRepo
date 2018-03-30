package thread.chapter_01.demo_1_2;

/**
 * Created by Marik on 2018/3/28 0028.
 */
public class MyThread_04 extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由 " + this.currentThread().getName() + " 计算，count=" + count);
    }
}
