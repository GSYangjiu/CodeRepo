package designPattern.prototype;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-04-02 08:50
 * Description:
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
