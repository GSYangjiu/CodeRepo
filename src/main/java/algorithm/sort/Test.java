package algorithm.sort;

/**
 * Created by Yang on 2017/12/26 0026.
 */
public class Test {
    public static void main(String[] args) {
        int[] sort = ArrayGenerator.random_order_array(10);
        System.out.println("排序前：");
        for (int i : sort) {
            System.out.print(sort[i] + " ");
        }

        //冒泡排序
        //BubbleSort.bubbleSort(algorithm.sort);

        //快速排序
        //QuickSort.quick(algorithm.sort);

        //选择排序
        SelectSort.selectSotr(sort);
        System.out.println();

        System.out.println("排序后 for 遍历：");
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }
    }
}
