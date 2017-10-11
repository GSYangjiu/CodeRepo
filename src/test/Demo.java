package test;

/**
 * Created by Yang on 2017/8/24 0024.
 */
public class Demo {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a instanceof A);
        System.out.println(a.getClass());
    }
}
