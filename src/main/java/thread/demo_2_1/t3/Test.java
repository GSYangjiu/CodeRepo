package thread.demo_2_1.t3;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-30 10:12
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        try {
            PublicVar publicVarRef = new PublicVar();
            ThreadA thread = new ThreadA(publicVarRef);
            thread.setName("yang");
            thread.start();
            Thread.sleep(200);
            publicVarRef.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
