package Thread.dirtyRead;

/**
 * Created by Yang on 2017/10/10 0010.
 */
public class Test {
    public static void main(String[] args) {
        try {
            Publicvar publicvarRef = new Publicvar();
            ThreadA thread = new ThreadA(publicvarRef);
            thread.start();
            Thread.sleep(200);
            publicvarRef.getValue();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
