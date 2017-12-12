package gof23.adapter;

/**
 * Created by Yang on 2017/12/12 0012.
 */
public class DBSocket implements DBSocketInterface{

    @Override
    public void powerWithTwoRound() {
        System.out.println("使用两孔圆头插座充电");
    }
}
