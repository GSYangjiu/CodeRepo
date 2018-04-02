package designPattern.prototype;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-04-02 08:51
 * Description:
 */
public class Cricle extends Shape {
    public Cricle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
