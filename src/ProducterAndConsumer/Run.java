package ProducterAndConsumer;

/**
 * Created by Yang on 2017/10/19 0019.
 */
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        Producter p = new Producter(lock);
        Consumer c = new Consumer(lock);

        Thread pThread = new ThreadProducter(p);
        Thread cThread = new ThreadConsumer(c);
        pThread.start();
        cThread.start();
    }
}
