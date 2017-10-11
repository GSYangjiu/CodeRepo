package Thread;

/**
 * Created by Yang on 2017/10/10 0010.
 */
public class MyThread extends Thread{
    private int i;
    public MyThread(int i){
        super();
        this.i = i;
    }
    @Override
    public void run(){
        System.out.println(i);
    }
}
