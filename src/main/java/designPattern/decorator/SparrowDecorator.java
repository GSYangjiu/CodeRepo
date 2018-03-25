package designPattern.decorator;

/**
 * Created by: Yang
 * Date: 2018-03-25
 * Time: 0:38
 */
public class SparrowDecorator extends Decorator {
    public final int DISTANCE = 50;

    SparrowDecorator(Bird bird) {
        super(bird);
    }

    @Override
    public int fly() {
        return bird.fly() + eleFly();
    }

    private int eleFly() {
        return DISTANCE;
    }
}
