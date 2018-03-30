package thread.chapter_02.demo_2_1.synNotExtends;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-30 16:35
 * Description: 同步不具备继承
 */
public class Sub extends Main {
    @Override
    public void serviceMethod() {
        try {
            System.out.println("int main 下一步sleep begin "
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步sleep end "
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
