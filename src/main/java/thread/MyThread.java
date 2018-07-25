package thread;

import java.util.List;

/**
 * Created by Yang on 2017/10/10 0010.
 */
public class MyThread extends Thread {
    private List<Integer> list;

    public MyThread(List<Integer> list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i : list) {
            System.out.println(i);
        }
    }
}
