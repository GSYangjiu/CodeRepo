package thread.chapter_02.demo_2_1.synLockIn_2;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-30 10:46
 * Description:
 */
public class Main {
    public int i = 10;

    synchronized public void operateIMainMethoe() {
        try {
            i--;
            System.out.println("main print i =" + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
