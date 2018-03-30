package thread.chapter_02.demo_2_1.synLockIn_2;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-30 10:47
 * Description:
 */
public class Sub extends Main {
    synchronized public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.operateIMainMethoe();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
