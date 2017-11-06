package collection.list;

/**
 * Created by Yang on 2017/8/30 0030.
 */
public class Demo {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>() {{
//            add(2);add(3);add(4);add(10);add(15);add(16);add(17);
//        }};
//        System.out.println("移除前list长度："+list.size());
//        System.out.println(list.get(1));
//        list.remove(6);
//        System.out.println("移除后list长度："+list.size());
//        System.out.println(list.get(1));
//        SxtArrayList a = new SxtArrayList();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        System.out.println("移除前list长度："+a.size());
//        a.remove(2);
//        System.out.println("移除后list长度："+a.size());
        SxtLinkList linkList = new SxtLinkList();
        linkList.add("123");
        linkList.add("456");
        linkList.add("789");
        linkList.add("12424");
        System.out.println(linkList.size());
        //System.out.println(linkList.get(1));
        linkList.remove(1);
        System.out.println(linkList.get(0));
        System.out.println(linkList.get(1));
        System.out.println(linkList.get(2));
        System.out.println(linkList.size());
    }
}
