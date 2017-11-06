package static_test;

/**
 * Created by Yang on 2017/8/30 0030.
 */
public class Demo {
    public static void main(String[] args) {
        staticFunction();
    }

    static Demo st = new Demo();

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    Demo(){
        System.out.println("3");
        System.out.println("a="+a+" b="+b);
    }

    public static void staticFunction(){
        System.out.println("4");
    }

    int a = 110;
    static int b = 112;
}
