package thread.chapter_02.demo_2_1.synLockIn_1;

import thread.synchronizedLock.Service;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-30 10:39
 * Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
