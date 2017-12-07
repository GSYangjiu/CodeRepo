package gof23.factory.abstractFactory.seat;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public class LowSeat implements Seat{
    @Override
    public void massage() {
        System.out.println("不能自动按摩！");
    }
}
