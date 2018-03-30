package thread.demo_1_2.t4_threadsafe;

/**
 * Created by Marik on 2018/3/28 0028.
 */
public class BLogin extends Thread{
    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
