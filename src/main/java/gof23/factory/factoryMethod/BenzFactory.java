package gof23.factory.factoryMethod;

import gof23.factory.Benz;
import gof23.factory.Car;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
