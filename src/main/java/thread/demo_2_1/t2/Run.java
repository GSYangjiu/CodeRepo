package thread.demo_2_1.t2;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-30 08:49
 * Description:
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA athread = new ThreadA(numRef);
        athread.start();
        ThreadB bthread = new ThreadB(numRef);
        bthread.start();
    }
}
