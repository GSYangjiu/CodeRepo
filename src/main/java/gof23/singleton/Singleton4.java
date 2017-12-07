package gof23.singleton;

/**
 * Created by Yang on 2017/10/20 0020.
 * 饿汉，变种，使用static代码块在类加载的时候初始化对象，本质与3没有区别
 */
public class Singleton4 {
    private static Singleton4 instance = null;

    static {
        instance = new Singleton4();
    }

    private Singleton4(){

    }

    public static Singleton4 getInstance(){
        return instance;
    }
}
