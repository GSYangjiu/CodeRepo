package designPattern.abstractFactory.seat;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public class LuxurySeat implements Seat{
    @Override
    public void massage() {
        System.out.println("可以自动按摩！");
    }
}
