package designPattern.bulider.pack;

import designPattern.bulider.interfaces.Packing;

/**
 * @author Yang.
 * email : vincent1094259423@yahoo.com
 * date  : 2018-12-14 11:41
 * description:
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
