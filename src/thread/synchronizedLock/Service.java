package thread.synchronizedLock;

/**
 * Created by Yang on 2017/10/10 0010.
 * 锁重入
 * “当一个线程得到一个对象锁后，再次请求此对象锁时是可以再次得到该对象的锁的”
 * 就是说在一个synchronized代码块内部调用本类其他synchronized方法时，是永远可以拿到锁的
 */
public class Service {
    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized public void service3(){
        System.out.println("service3");
    }
}
