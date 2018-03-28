package thread.demo_1_2;

/**
 * Created by Marik on 2018/3/28 0028.
 */
public class Run {
    public static void main(String[] args) {
        MyThread_01 myThread = new MyThread_01();
        myThread.start();
        System.out.println("运行结束");
    }
}
