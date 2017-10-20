package designPatterns.singleton;

/**
 * Created by Yang on 2017/10/20 0020.
 * 双重检验锁
 */
public class Singleton7 {
    private volatile static Singleton7 singleton;
    private Singleton7 (){}
    public static Singleton7 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton7.class) {
                if (singleton == null) {
                    singleton = new Singleton7();
                }
            }
        }
        return singleton;
    }
}
