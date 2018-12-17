package designPattern.bulider;

import designPattern.bulider.interfaces.Item;
import designPattern.bulider.interfaces.Packing;
import designPattern.bulider.pack.Wrapper;

/**
 * @author Yang.
 * email : vincent1094259423@yahoo.com
 * date  : 2018-12-14 11:42
 * description:
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
