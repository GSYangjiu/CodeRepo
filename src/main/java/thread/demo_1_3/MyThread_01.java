package thread.demo_1_3;

/**
 * Created by Yang.
 * Date  : 2018-03-28
 * Time  : 15:25
 * Email : vincent1094259423@yahoo.com
 * Description:
 */
public class MyThread_01 extends Thread {
    public MyThread_01() {
        System.out.println(" 构造方法的打印： " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println(" run方法的打印： " + Thread.currentThread().getName());
    }
}
