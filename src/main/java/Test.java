import java.util.*;

/**
 * Created by Yang on 2017/10/25 0025.
 */
public class Test {
    public final int i = 1;

    public static void main(String[] args) {

    }

    static Random r = new Random();
    static String ssource = "ABCDEFGHIJKLMNOOPQRSTUVWXYZ" +
            "abcdefghijklmnoopqrstuvwxyz";
    static char[] src = ssource.toCharArray();

    public static String ranString(int length) {
        char[] buf = new char[length];
        int rnd;
        for (int i = 0; i < length; i++) {
            rnd = Math.abs(r.nextInt()) % src.length;
            buf[i] = src[rnd];
        }
        return new String(buf);
    }
}
