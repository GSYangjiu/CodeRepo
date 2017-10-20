package designPatterns.singleton;

/**
 * Created by Yang on 2017/10/20 0020.
 * 懒汉模式，线程不安全，即多线程下无法保证单例
 */

public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        if(instance==null){
            instance = new Singleton1();
        }
        return instance;
    }
}
