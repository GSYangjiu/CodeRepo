package designPattern.singleton;

import java.io.Serializable;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-08-27 14:16
 * Description:
 */
public class SerSingleton implements Serializable {
    String name;

    private SerSingleton() {
        System.out.println("Singleton is create");

        name = "SerSingleton";
    }

    private static SerSingleton instance = new SerSingleton();

    public static SerSingleton getInstance() {
        return instance;
    }

    public static void createString() {
        System.out.println("createSting is Singleton");
    }

    public Object readResolve() {
        return instance;
    }
}

