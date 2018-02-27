package algorithm;

/**
 * Created by Yang on 2018/2/27 0027.
 */
public class Fibonacci {
    private static int getFibo(int i) {
        if (i < 0) {
            return -1;
        } else if (i == 0) {
            return 0;
        } else if (i == 1 || i == 2) {
            return 1;
        } else {
            return getFibo(i - 1) + getFibo(i - 2);
        }
    }

    public static void main(String[] args) {
        int i = getFibo(0);
        System.out.println(i);
    }
}
