package designPattern.singleton;

/**
 * Created by Yang on 2017/10/20 0020.
 * 饿汉模式，类加载的时候就完成对象的初始化
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3(){

    }

    public static Singleton3 getInstance(){
        return instance;
    }
}
