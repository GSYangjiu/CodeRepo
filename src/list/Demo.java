package list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yang on 2017/8/30 0030.
 */
public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>() {{
            add(2);add(3);add(4);add(10);add(15);add(16);add(17);
        }};
        System.out.println("移除前list长度："+list.size());
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println("移除后list长度："+list.size());
        System.out.println(list.get(1));
    }
}
