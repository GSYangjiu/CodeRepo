package thread.chapter_02.demo_2_1.synNotExtends;

import sun.security.provider.Sun;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-30 16:36
 * Description:
 */
public class MyThreadA extends Thread {
    private Sub sub;

    public MyThreadA(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
