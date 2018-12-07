import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-08-27 17:52
 * Description:
 */
public class Main {
    public static int[] plusOne(int[] digits) {
        long x = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            x += digits[i] * Math.pow(10, digits.length - i - 1);
        }
        String[] temp = String.valueOf(x + 1).split("");
        int[] result = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            result[i] = Integer.parseInt(temp[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        char[] a = {9,8,7,6,5,4,3,2,1,0};
        int b = a[0];
    }
}
