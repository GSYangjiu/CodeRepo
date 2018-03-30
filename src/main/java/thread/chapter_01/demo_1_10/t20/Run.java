package thread.chapter_01.demo_1_10.t20;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-29 14:57
 * Description:
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            a.setPriority(Thread.NORM_PRIORITY - 3);
            a.start();
            ThreadB b = new ThreadB();
            b.setPriority(Thread.NORM_PRIORITY + 3);
            b.start();
            Thread.sleep(2000);
            a.stop();
            b.stop();
            System.out.println("a= " + a.getCount());
            System.out.println("b= " + b.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
