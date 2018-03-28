package thread.demo_1_2;

/**
 * Created by Marik on 2018/3/28 0028.
 */
public class Test_02 {
    public static void main(String[] args) {
        try {
            MyThread_02 thread = new MyThread_02();
            thread.setName("myThread");
            thread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main = " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}