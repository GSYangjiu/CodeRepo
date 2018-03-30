package thread.chapter_01.demo_1_10.demo_1_10_1;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-29 14:12
 * Description: 线程优先级的继承特性
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority = " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end   priority = " + Thread.currentThread().getPriority());

        MyThread_01 thread1 = new MyThread_01();
        thread1.start();
    }
}
