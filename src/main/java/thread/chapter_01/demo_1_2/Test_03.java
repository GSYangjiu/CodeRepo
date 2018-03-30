package thread.chapter_01.demo_1_2;

/**
 * Created by Marik on 2018/3/28 0028.
 */
public class Test_03 {
    public static void main(String[] args) {
        MyThread_03 a = new MyThread_03("A");
        MyThread_03 b = new MyThread_03("B");
        MyThread_03 c = new MyThread_03("C");
        a.start();
        b.start();
        c.start();
    }
}
