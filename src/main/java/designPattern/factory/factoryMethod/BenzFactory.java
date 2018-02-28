package designPattern.factory.factoryMethod;

import designPattern.factory.Benz;
import designPattern.factory.Car;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
