package designPattern.state;

/**
 * @author Yang.
 * email : vincent1094259423@yahoo.com
 * date  : 2018-12-17 09:26
 * description:状态模式
 */
public class Gun {
    State stateThree, stateTwo, stateOne, stateNull;
    State state;

    public Gun() {
        stateThree = new BulletStateThree(this);
        stateTwo = new BulletStateTwo(this);
        stateOne = new BulletStateOne(this);
        stateNull = new BulletStateNull(this);
        state = stateThree;
    }

    public void fire() {
        state.fire();
    }

    public void loadBullet() {
        state.loadBullet();
    }

    public State getStateThree() {
        return stateThree;
    }

    public void setStateThree(State stateThree) {
        this.stateThree = stateThree;
    }

    public State getStateTwo() {
        return stateTwo;
    }

    public void setStateTwo(State stateTwo) {
        this.stateTwo = stateTwo;
    }

    public State getStateOne() {
        return stateOne;
    }

    public void setStateOne(State stateOne) {
        this.stateOne = stateOne;
    }

    public State getStateNull() {
        return stateNull;
    }

    public void setStateNull(State stateNull) {
        this.stateNull = stateNull;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
