package collection.map;

import java.util.Date;

/**
 * Created by Yang on 2017/10/21 0021.
 */
public class Test {
    public static void main(String[] args) {
        SxtHashMap map = new SxtHashMap();
        Car car1 = new Car("奔驰",10000);
        map.put("杨杨杨",car1);
        Car newCar = (Car)map.get("杨杨杨");
        System.out.println(map.containskey("杨杨杨"));
        System.out.println(newCar.getName());
        System.out.println(map.toString());

        SxtNewHashMap newHashMap = new SxtNewHashMap();
        Car car2 = new Car("宝马",20000);
        newHashMap.put("第一辆",car1);
        newHashMap.put("第二辆",car2);
        System.out.println(newHashMap.containskey("第一辆"));
        Car newCar2 = (Car)newHashMap.get("第一辆");
        System.out.println(newCar2.toString());
        System.out.println(newHashMap.toString());
        System.out.println(new Date().toString());
    }
}

class Car{
    private double price;
    private String name;

    public Car(String name,double price){
        super();
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
