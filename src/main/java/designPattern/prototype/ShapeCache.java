package designPattern.prototype;

import java.util.Hashtable;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-04-02 08:54
 * Description:
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Cricle cricle = new Cricle();
        cricle.setId("1");
        shapeMap.put(cricle.getId(), cricle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
