package sort;

/**
 * Created by Yang on 2017/12/27 0027.
 */
public class SelectSort {
    public static void selectSotr(int[] numbers) {
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > i; j--) {
                if (numbers[j] < numbers[i]) {
                    numbers[j] = numbers[i] ^ numbers[j];
                    numbers[i] = numbers[i] ^ numbers[j];
                    numbers[j] = numbers[j] ^ numbers[i];
                }
            }
        }
    }
}
