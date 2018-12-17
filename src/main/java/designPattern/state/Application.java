package designPattern.state;

/**
 * @author Yang.
 * email : vincent1094259423@yahoo.com
 * date  : 2018-12-17 09:41
 * description:
 */
public class Application {
    public static void main(String[] args) {
        Gun gun = new Gun();
        gun.fire();
        gun.fire();
        gun.fire();
        gun.fire();
        gun.loadBullet();
        gun.fire();
    }
}
