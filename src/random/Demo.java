package random;

import java.util.Random;

/**
 * Created by Yang on 2017/8/30 0030.
 */
public class Demo {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 5, 4, 3, 42, 71, 25, 6};
        Random random = new Random();
        int index = random.nextInt(numbers.length);
        System.out.println(numbers[index]);
    }
}
