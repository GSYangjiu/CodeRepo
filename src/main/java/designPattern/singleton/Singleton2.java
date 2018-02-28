package designPattern.singleton;

/**
 * Created by Yang on 2017/10/20 0020.
 * 懒汉模式，线程安全，但是效率低，
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){

    }

    synchronized public static Singleton2 getInstance(){
        if (instance==null){
            instance = new Singleton2();
        }
        return instance;
    }
}
