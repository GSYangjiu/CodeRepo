package designPattern.prototype;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-04-02 08:47
 * Description:
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
