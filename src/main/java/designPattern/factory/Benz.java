package designPattern.factory;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public class Benz implements Car {
    private String name = "奔驰";

    @Override
    public String getName(){
        return this.name;
    }
}
