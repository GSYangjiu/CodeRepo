package thread.demo_1_7;

/**
 * Created by Yang.
 * Date  : 2018-03-28
 * Time  : 16:01
 * Email : vincent1094259423@yahoo.com
 * Description:
 */
public class MyThread_01 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
