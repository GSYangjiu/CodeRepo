package Exception;

import Clazz.Test;

/**
 * Created by Yang on 2017/9/21 0021.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static String test(){
        try {
            System.out.println("1");
            return "返回成功";
        }catch (Exception e){
            System.out.println("2");
        }finally {
            System.out.println("3");
            return "返回成功++";
        }
    }
}
