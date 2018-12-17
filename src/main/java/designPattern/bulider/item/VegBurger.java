package designPattern.bulider.item;

import designPattern.bulider.Burger;

/**
 * @author Yang.
 * email : vincent1094259423@yahoo.com
 * date  : 2018-12-14 11:43
 * description:
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
