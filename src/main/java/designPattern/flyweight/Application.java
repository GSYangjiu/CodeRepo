package designPattern.flyweight;

import designPattern.bridge.Circle;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-04-02 10:38
 * Description:享元模式
 */
public class Application {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Cricle cricle = (Cricle) ShapeFactory.getShape(getRandomColor());
            cricle.setX(getRandomX());
            cricle.setY(getRandomY());
            cricle.setRadius(100);
            cricle.draw();
        }
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
