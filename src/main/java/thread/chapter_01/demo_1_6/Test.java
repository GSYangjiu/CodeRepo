package thread.chapter_01.demo_1_6;

/**
 * Created by Yang.
 * Date  : 2018-03-28
 * Time  : 15:52
 * Email : vincent1094259423@yahoo.com
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId());
    }
}
