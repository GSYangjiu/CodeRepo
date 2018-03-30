package thread.chapter_02.demo_2_1.synNotExtends;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-30 16:32
 * Description:
 */
public class Main {
    synchronized public void serviceMethod() {
        try {
            System.out.println("int main 下一步sleep begin "
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步sleep end "
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
