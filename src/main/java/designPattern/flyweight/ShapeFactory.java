package designPattern.flyweight;

import java.util.HashMap;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-04-02 10:31
 * Description:
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getShape(String color) {
        Cricle cricle = (Cricle) circleMap.get(color);

        if (cricle == null) {
            cricle = new Cricle(color);
            circleMap.put(color, cricle);
            System.out.println("Creating circle of color : " + color);
        }
        return cricle;
    }
}
