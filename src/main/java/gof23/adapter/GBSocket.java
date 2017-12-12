package gof23.adapter;

/**
 * Created by Yang on 2017/12/12 0012.
 */
public class GBSocket implements GBSocketInterface {
    @Override
    public void powerWithThreeFlat() {
        System.out.println("使用三口扁插头充电");
    }
}
