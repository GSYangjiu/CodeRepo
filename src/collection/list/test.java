package collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yang on 2017/10/14 0014.
 */
public class test {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("aaa");
        l1.add(1234);
        System.out.println(l1.size());
        List l2 = new ArrayList();
        l2.add("bbb");
        l2.add("ccc");
        l1.addAll(l2);
        System.out.println(l1.size());
    }
}
