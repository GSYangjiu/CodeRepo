package thread.chapter_01.demo_1_2;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-28 16:02
 * Description:
 */
public class MyThread_03 extends Thread {
    private int count = 5;

    public MyThread_03(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由 " + this.currentThread().getName() + " 计算，count=" + count);
        }
    }
}
