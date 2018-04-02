package thread.chapter_02.demo_2_2.doubleSynBlockOneTwo;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-04-02 14:57
 * Description:
 */
public class ObjectService {
    public void serviceMethodA() {
        try {
            synchronized (this) {
                System.out.println("A being time = " + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end    edn = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void serviceMethodB() {
        synchronized (this) {
            System.out.println("B being time = " + System.currentTimeMillis());
            System.out.println("Bee end    edn = " + System.currentTimeMillis());
        }
    }
}
