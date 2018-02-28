package designPattern.factory.simpleFactory;

import designPattern.factory.Audi;
import designPattern.factory.Benz;
import designPattern.factory.Car;

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
