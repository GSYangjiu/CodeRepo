package test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yang on 2017/11/14 0014.
 */
public class test {
    public static void main(String[] args) {
        A a = new B();
        A b = new A();
        b = (B) b;
        b.getName();
        a = (A) a;
        a.getName();
    }
}

class P {
    public String name;
}