package algorithm;

/**
 * Created by Yang on 2018/2/27 0027.
 */
public class Swap {
    //交换数组i，j
    public static void swap(int[] a, int i, int j) {
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }
}
