package thread.chapter_01.demo_1_2;

/**
 * Created by Marik on 2018/3/28 0028.
 */
public class Test_04 {
    public static void main(String[] args) {
        MyThread_04 myThread = new MyThread_04();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
