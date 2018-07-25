package thread;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yang on 2017/10/10 0010.
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        MyThread myThread = new MyThread(list);
        myThread.start();
    }
}
