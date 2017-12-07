package gof23.factory;

import gof23.factory.abstractFactory.LuxuryCarFactory;
import gof23.factory.abstractFactory.engine.Engine;
import gof23.factory.factoryMethod.AudiFactory;
import gof23.factory.factoryMethod.BenzFactory;
import gof23.factory.simpleFactory.SimpleFactory;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public class Test {
    public static void main(String[] args) {
        //简单工厂
        Car car1 = SimpleFactory.create("奥迪");
        Car car2 = SimpleFactory.create("奔驰");
        System.out.println("简单工厂造的奥迪：" + car1.getName());
        System.out.println("简单工厂造的奔驰：" + car2.getName());

        //工厂方法模式
        Car car3 = new AudiFactory().createCar();
        System.out.println("工厂方法造的奥迪：" + car3.getName());
        Car car4 = new BenzFactory().createCar();
        System.out.println("工厂方法造的奔驰：" + car4.getName());

        //抽象工厂模式
        Engine e = new LuxuryCarFactory().createEngine();
        e.run();
        e.start();
    }
}
