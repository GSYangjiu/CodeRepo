package test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yang on 2017/11/14 0014.
 */
public class test {
    public static void main(String[] args) {
        List<List<String>> fatherList = new LinkedList<List<String>>();
        List<String> sonList = new LinkedList<String>();
        sonList.add("AAA");
        fatherList.add(sonList);
        sonList.add("BBB");
        System.out.println(fatherList.toString());
    }
}
