package thread.chapter_02.demo_2_2.syn_Out_asyn;

import java.util.Collections;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-04-02 15:28
 * Description:
 */
public class MyThreadB extends Thread {
    private MyList list;

    public MyThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add("threadB" + (i + 1));
        }
    }
}
