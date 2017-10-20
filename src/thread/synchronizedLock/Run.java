package thread.synchronizedLock;

/**
 * Created by Yang on 2017/10/10 0010.
 */
public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
