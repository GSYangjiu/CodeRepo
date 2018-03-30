package thread.chapter_01.demo_1_9;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-29 11:48
 * Description: yield方法
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000; i++) {
            Thread.yield();
            count += (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(" 用时：" + (endTime - beginTime) + " 毫秒！");
    }
}