package thread;

/**
 * Created by Yang on 2017/10/10 0010.
 */
public class Test {
    public static void main(String[] args) {
        MyThread t11 = new MyThread(1);
        MyThread t12 = new MyThread(2);
        MyThread t13 = new MyThread(3);
//        MyThread_01 t14 = new MyThread_01(4);
//        MyThread_01 t15 = new MyThread_01(5);
//        MyThread_01 t16 = new MyThread_01(6);
//        MyThread_01 t17 = new MyThread_01(7);
//        MyThread_01 t18 = new MyThread_01(8);
//        MyThread_01 t19 = new MyThread_01(9);
//        MyThread_01 t110 = new MyThread_01(10);
//        MyThread_01 t111 = new MyThread_01(11);
//        MyThread_01 t112 = new MyThread_01(12);
//        MyThread_01 t113 = new MyThread_01(13);
        t11.start();
        t12.start();
        t13.start();
        t11.start();
//        t14.start();
//        t15.start();
//        t16.start();
//        t17.start();
//        t18.start();
//        t19.start();
//        t110.start();
//        t111.start();
//        t112.start();
//        t113.start();
    }
}
