package ProducterAndConsumer;

/**
 * Created by Yang on 2017/10/19 0019.
 */
public class ThreadProducter extends Thread {
    private Producter producter;

    public ThreadProducter(Producter producter){
        super();
        this.producter = producter;
    }

    @Override
    public void run(){
        while (true){
            producter.setValue();
        }
    }
}
