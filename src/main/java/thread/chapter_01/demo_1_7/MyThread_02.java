package thread.chapter_01.demo_1_7;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-28 16:16
 * Description:
 */
public class MyThread_02 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()) {
                System.out.println(" 已是停止状态!我要退出了！");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
    }
}
