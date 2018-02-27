package algorithm;

/**
 * Created by Yang on 2018/2/27 0027.
 */
public class Reverse {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(reverse(str));
    }

    public static String reverse(String originStr) {
        if(originStr == null || originStr.length() <= 1)
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }
}
