package designPattern.facade;

/**
 * Created by: Yang
 * Date: 2018-03-29
 * Time: 20:14
 */
public class TypeSeting {
    String advertisement;

    public TypeSeting(String advertisment) {
        this.advertisement = advertisment;
    }

    public void typeSeting() {
        System.out.println("广告排版格式");
        System.out.println("********");
        System.out.println(advertisement);
        System.out.println("********");
    }
}
