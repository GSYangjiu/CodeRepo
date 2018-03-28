package thread.demo_1_7;

import designPattern.factory.Car;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-28 16:04
 * Description: isInterrupted和interrupted的区别
 */
public class Run_01 {
    public static void main(String[] args) {
        try {
            MyThread_01 thread = new MyThread_01();
            thread.start();
            Thread.sleep(10000);
            thread.interrupt();
            //Thread.currentThread().interrupt();
            System.out.println(" 是否停止1？ =" + thread.isInterrupted());
            System.out.println(" 是否停止2？ =" + thread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
