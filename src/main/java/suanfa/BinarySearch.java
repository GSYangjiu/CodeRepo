package suanfa;

/**
 * Created by Yang on 2018/2/26 0026.
 */
public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2; //不要用（low+high）/2,可能溢出。规范：low + (high - low) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return low; //约定：没有找到目标元素，则把应该插入的位置返回
    }

    public static int binarySearchRecur(int[] arr, int key, int low, int high) {
        if (low > high) return low;
        int mid = low + (high - low) / 2;
        if (arr[mid] < key) {
            return binarySearchRecur(arr, key, mid + 1, high);
        } else if (arr[mid] > key) {
            return binarySearchRecur(arr, key, low, mid - 1);
        } else {
            return low;
        }
    }

    //上面两个方法只能处理不包含重复数据的数组，否则返回结果会不准确
    public static int firstOccurrence(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] >= key) {
                high = mid - 1;
            }
        }
        return low;
    }

    public static int firstOccurrenceRecur(int[] arr, int key, int low, int high) {
        if (low > high) return low;
        int mid = low + (high - low) / 2;
        if (arr[mid] < key) {
            return binarySearchRecur(arr, key, mid + 1, high);
        } else {
            return binarySearchRecur(arr, key, low, mid - 1);
        }
    }
}
