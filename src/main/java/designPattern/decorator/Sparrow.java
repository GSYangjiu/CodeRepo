package designPattern.decorator;

/**
 * Created by: Yang
 * Date: 2018-03-25
 * Time: 0:31
 */
public class Sparrow extends Bird {
    public final int DISTANCE = 100;

    @Override
    public int fly() {
        return DISTANCE;
    }
}
