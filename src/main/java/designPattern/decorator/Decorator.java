package designPattern.decorator;

/**
 * Created by: Yang
 * Date: 2018-03-25
 * Time: 0:35
 */
public abstract class Decorator extends Bird {
    protected Bird bird;

    public Decorator() {

    }

    public Decorator(Bird bird) {
        this.bird = bird;
    }
}
