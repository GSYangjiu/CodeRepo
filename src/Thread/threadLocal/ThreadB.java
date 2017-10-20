package Thread.threadLocal;

import test.B;

/**
 * Created by Yang on 2017/10/20 0020.
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i ++) {
                Tools.t1.set("ThreadB" + (i + 1));
                System.out.println("YhreadB get Value = " + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
