package designPattern.bridge;

/**
 * Created by Yang.
 * Email:     vincent1094259423@yahoo.com
 * Date :     2018-03-30 11:47
 * PS   :     桥接模式
 */
public class Application {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
