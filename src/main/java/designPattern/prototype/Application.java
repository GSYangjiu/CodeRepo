package designPattern.prototype;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-04-02 09:01
 * Description:
 */
public class Application {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
