package algorithm.sort;

/**
 * Created by Yang on 2017/12/26 0026.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayGenerator {
    public static int[] random_order_array(int len) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        int[] array = new int[len];
        for (int i = 0; i < len; i++)
            array[i] = list.get(i);
        return array;
    }

    public static int[] ordered_array(int len) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++)
            array[i] = i;
        return array;
    }

    public static boolean is_ordered_array(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i])
                return false;
        }
        return true;
    }

    public static void print_array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = random_order_array(10);
        print_array(array);
        System.out.println(is_ordered_array(array));
    }
}