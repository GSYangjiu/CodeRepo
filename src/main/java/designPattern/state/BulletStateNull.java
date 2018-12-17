package designPattern.state;

/**
 * @author Yang.
 * email : vincent1094259423@yahoo.com
 * date  : 2018-12-17 09:39
 * description:
 */
public class BulletStateNull extends State {
    Gun gun;

    public BulletStateNull(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void fire() {
        System.out.print("不能射出子弹");
        System.out.println("（目前是" + showStateMess() + "）");
    }

    @Override
    public void loadBullet() {
        System.out.print("装弹");
        gun.setState(gun.getStateThree());
        System.out.println("（进入" + gun.getStateThree().showStateMess() + "）");
    }

    @Override
    public String showStateMess() {
        return "无子弹状态";
    }
}
