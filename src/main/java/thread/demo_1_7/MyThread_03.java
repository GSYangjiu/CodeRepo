package thread.demo_1_7;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-28 16:49
 * Description:
 */
public class MyThread_03 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (interrupted()) {
                System.out.println(" 已经是停止状态了！我要退出了！");
                break;
            }
            System.out.println(" i=" + (i + 1));
        }
        System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止");
    }
}
