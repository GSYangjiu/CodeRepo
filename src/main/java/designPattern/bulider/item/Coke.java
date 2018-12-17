package designPattern.bulider.item;

import designPattern.bulider.ColdDrink;

/**
 * @author Yang.
 * email : vincent1094259423@yahoo.com
 * date  : 2018-12-14 11:44
 * description:
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
