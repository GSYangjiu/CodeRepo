package gof23.factory.factoryMethod;

import gof23.factory.Audi;
import gof23.factory.Car;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public class AudiFactory implements CarFactory {
    public Car createCar() {
        return new Audi();
    }
}
