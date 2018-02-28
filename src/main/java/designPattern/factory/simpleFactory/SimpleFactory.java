package gof23.factory.simpleFactory;

import gof23.factory.Audi;
import gof23.factory.Benz;
import gof23.factory.Car;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public class SimpleFactory {
    public static Car create(String name) {
        if ("奥迪".equals(name)) {
            return new Audi();
        } else if ("奔驰".equals(name)) {
            return new Benz();
        } else {
            return null;
        }
    }
}
