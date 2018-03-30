package thread.chapter_02.demo_2_2.t1;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-30 16:50
 * Description:
 */
public class Task {
    private String getData1;
    private String getData2;

    synchronized public void doLongTimeTask() {
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            getData1 = " 长时间处理任务后从远程返回的值 1 threadName=" + Thread.currentThread().getName();
            getData2 = " 长时间处理任务后从远程返回的值 2 threadName=" + Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
