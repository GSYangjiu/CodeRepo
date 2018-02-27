package algorithm.sort;

import algorithm.Swap;

/**
 * Created by Yang on 2017/12/27 0027.
 */
public class QuickSort {
    private static int getMiddle(int[] arr, int low, int high) {
        int temp = arr[low];
        while (low < high) {
            while (low < high && arr[high] > temp) {
                high--;
            }
            arr[low] = arr[high];

            while (low < high && arr[low] < temp) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high && arr.length > 0) {
            int middle = getMiddle(arr, low, high);
            quickSort(arr, low, middle - 1);
            quickSort(arr, middle + 1, high);
        }
    }

    private static int getPartition(int[] arr, int beg, int end) {
        int first = arr[beg];
        int i = beg, j = end;
        while (i < j) {
            while (arr[beg] <= first && i < end) {
                i++;
            }
            while (arr[end] > first && j >= beg) {
                j--;
            }
            if (i < j) {
                Swap.swap(arr, i, j);
            }
        }
        if (j != beg) {
            Swap.swap(arr, j, beg);
        }
        return j;
    }

    public static void quick(int[] numbers) {
        if (numbers.length > 0) {
            quickSort(numbers, 0, numbers.length - 1);
        }
    }
}
