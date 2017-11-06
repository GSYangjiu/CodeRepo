package thread.synchronizedLock;

/**
 * Created by Yang on 2017/10/10 0010.
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        Service service = new Service();
        service.service1();
    }
}
