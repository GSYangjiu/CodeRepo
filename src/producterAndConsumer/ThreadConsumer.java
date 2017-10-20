package producterAndConsumer;

/**
 * Created by Yang on 2017/10/19 0019.
 */
public class ThreadConsumer extends Thread{
    private Consumer consumer;

    public ThreadConsumer(Consumer consumer){
        super();
        this.consumer = consumer;
    }

    @Override
    public void run(){
        while (true){
            consumer.getValue();
        }
    }
}
