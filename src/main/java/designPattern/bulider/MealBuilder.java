package designPattern.bulider;

import designPattern.bulider.item.ChickenBurger;
import designPattern.bulider.item.Coke;
import designPattern.bulider.item.Pepsi;
import designPattern.bulider.item.VegBurger;

/**
 * @author Yang.
 * email : vincent1094259423@yahoo.com
 * date  : 2018-12-14 11:45
 * description:
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
