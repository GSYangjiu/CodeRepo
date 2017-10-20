package ProducterAndConsumer;


/**
 * Created by Yang on 2017/10/18 0018.
 */
public class Producter {
    private String lock;

    public Producter(String lock) {
        super();
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set的值是 " + value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
