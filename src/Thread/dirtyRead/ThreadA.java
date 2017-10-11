package Thread.dirtyRead;

/**
 * Created by Yang on 2017/10/10 0010.
 */
public class ThreadA extends Thread{
    private Publicvar publicvar;
    public ThreadA(Publicvar publicvar){
        super();
        this.publicvar = publicvar;
    }

    @Override
    public void run(){
        super.run();
        publicvar.setValue("B","BB");
    }
}
