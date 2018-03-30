package thread.demo_2_1.t1;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-30 08:37
 * Description: "非线程安全”问题存在于“实例变量”中，如果是方法内部的私有变量，则不存在“非线程安全问题"
 * 方法中的变量不纯在非线程安全问题，永远都是线程安全的。这是方法内部的变量是私有的特性导致的
 */
public class HasSelfPrivateNum {
    public void addI(String usernamr) {
        try {
            int num = 0;
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
