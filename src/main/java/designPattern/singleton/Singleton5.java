package designPattern.singleton;

/**
 * Created by Yang on 2017/10/20 0020.
 * 懒汉模式，静态内部类，
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {

    }

    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
