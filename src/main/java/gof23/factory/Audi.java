package gof23.factory;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public class Audi implements Car {
    private String name = "奥迪";

    @Override
    public String getName(){
        return this.name;
    }
}
