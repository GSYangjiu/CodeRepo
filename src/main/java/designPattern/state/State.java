package designPattern.state;

/**
 * @author Yang.
 * email : vincent1094259423@yahoo.com
 * date  : 2018-12-17 09:29
 * description:抽象状态
 */
public abstract class State {
    public abstract void fire();

    public abstract void loadBullet();

    public abstract String showStateMess();
}
