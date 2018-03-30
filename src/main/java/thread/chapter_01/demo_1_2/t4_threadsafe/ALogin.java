package thread.chapter_01.demo_1_2.t4_threadsafe;

/**
 * Created by Marik on 2018/3/28 0028.
 */
public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a", "aa");
    }
}
