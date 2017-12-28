package sort;

/**
 * Created by Yang on 2017/12/27 0027.
 */
public class QuickSort {
    private static int getMiddle(int[] numbers, int low, int high) {
        int temp = numbers[low];
        while (low < high) {
            while (low < high && numbers[high] > temp) {
                high--;
            }
            numbers[low] = numbers[high];

            while (low < high && numbers[low] < temp) {
                low++;
            }
            numbers[high] = numbers[low];
        }
        numbers[low] = temp;
        return low;
    }

    private static int getPartition(int[] array, int beg, int end) {
        int first = array[beg];
        int i = beg, j = end;
        while (i < j) {
            while (array[beg] <= first && i < end) {
                i++;
            }
            while (array[end] > first && j >= beg) {
                j--;
            }
            if (i < j) {
                array[i] = array[i] ^ array[j];
                array[j] = array[i] ^ array[j];
                array[i] = array[i] ^ array[j];
            }
        }
        if (j != beg) {
            array[j] = array[beg] ^ array[j];
            array[beg] = array[beg] ^ array[j];
            array[j] = array[beg] ^ array[j];
        }
        return j;
    }

    private static void quickSort(int[] numbers, int low, int high) {
        if (low < high && numbers.length > 0) {
            int middle = getMiddle(numbers, low, high);
            quickSort(numbers, low, middle - 1);
            quickSort(numbers, middle + 1, high);
        }
    }

    public static void quick(int[] numbers) {
        if (numbers.length > 0) {
            quickSort(numbers, 0, numbers.length - 1);
        }
    }
}
