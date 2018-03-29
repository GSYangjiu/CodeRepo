package thread.demo_1_10.demo_1_10_1;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-29 14:09
 * Description:
 */
public class MyThread_01 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread_01 run priority = " + this.getPriority());
        MyThread_02 myThread2 = new MyThread_02();
        myThread2.start();
    }


}
