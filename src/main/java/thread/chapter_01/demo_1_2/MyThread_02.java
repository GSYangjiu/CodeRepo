package thread.chapter_01.demo_1_2;

/**
 * Created by Yang.
 * Date : 2018 - 03 - 28
 * Time : 15 - 22
 * Description:
 */
public class MyThread_02 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run = " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
