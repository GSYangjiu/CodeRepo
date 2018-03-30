package thread.demo_2_1.synLockIn_1;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-30 10:40
 * Description:
 */
public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
