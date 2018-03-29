package thread.demo_1_8;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-29 11:02
 * Description: 注意不要在同步代码块中使用suspend方法，容易导致线程阻塞
 */
public class Run_syn {
    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    System.out.println("thread2启动了，但进入不了printString()方法！ 只打印1个bug");
                    System.out.println(" 因为printString() 方法被a线程锁定并永远suspend暂停了！");
                    object.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
