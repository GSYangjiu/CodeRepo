package thread.chapter_02.demo_2_1.t2;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-30 09:04
 * Description:
 */
public class HasSelfPrivateNum {
    int num = 0;

    synchronized public void addI(String usernamr) {
        try {
            //int num = 0;
            if (usernamr.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(usernamr + " num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
