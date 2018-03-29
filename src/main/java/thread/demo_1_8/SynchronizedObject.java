package thread.demo_1_8;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-29 11:01
 * Description:
 */
public class SynchronizedObject {
    synchronized public void printString(){
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("a线程永远 suspend了!");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
