package sort;

/**
 * Created by Yang on 2017/12/26 0026.
 */
public class BubbleSort {
    public static void bubbleSort(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[i]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

//    private static void temp(int x, int y) {
//        int temp = x;
//        x = y;
//        y = temp;
//    }
}
