package Clazz;

import java.util.Date;

/**
 * Created by Yang on 2017/9/2 0002.
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
//        Date d = new Date();
//        Class cl = d.getClass();
//        String str = cl.getName();
//        System.out.println(cl);
        String classname = "java.util.Date";
        Class cl = Class.forName(classname);
        System.out.println(cl.getName());
    }
}
