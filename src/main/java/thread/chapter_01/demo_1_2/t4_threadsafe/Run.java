package thread.chapter_01.demo_1_2.t4_threadsafe;

/**
 * Created by Marik on 2018/3/28 0028.
 */
public class Run {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
