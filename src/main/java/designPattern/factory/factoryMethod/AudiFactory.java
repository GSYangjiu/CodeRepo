package designPattern.factory.factoryMethod;

import designPattern.factory.Audi;
import designPattern.factory.Car;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public class AudiFactory implements CarFactory {
    public Car createCar() {
        return new Audi();
    }
}
