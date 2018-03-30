package thread.chapter_02.demo_2_1.twoObjectTwoLock;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-30 09:09
 * Description:synchronized取得的锁都是对象所，而不是把一段代码或者方法当作锁
 *             所以多个线程访问多个对象，jvm会创建多个锁
 */
public class HasSelfPrivateNum {
    private int num = 0;

    synchronized public void addI(String username) {
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
