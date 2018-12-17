package designPattern.state;

/**
 * @author Yang.
 * email : vincent1094259423@yahoo.com
 * date  : 2018-12-17 09:37
 * description:
 */
public class BulletStateTwo extends State {
    Gun gun;

    public BulletStateTwo(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void fire() {
        System.out.print("射出1颗子弹");
        gun.setState(gun.getStateOne());
        System.out.println("（进入" + gun.getStateOne().showStateMess() + "）");
    }

    @Override
    public void loadBullet() {
        System.out.println("无法装弹");
    }

    @Override
    public String showStateMess() {
        return "2颗子弹状态";
    }
}
