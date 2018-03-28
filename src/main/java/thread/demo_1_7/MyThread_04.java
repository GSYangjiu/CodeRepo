package thread.demo_1_7;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-28 17:00
 * Description:
 */
public class MyThread_04 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (interrupted()) {
                    System.out.println(" 已经是停止状态了！我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println(" i=" + (i + 1));
            }
            System.out.println(" 我在for下面");
        } catch (InterruptedException e) {
            System.out.println(" 进入MyThread.java类run方法中的catch了！");
            e.printStackTrace();
        }
    }
}
