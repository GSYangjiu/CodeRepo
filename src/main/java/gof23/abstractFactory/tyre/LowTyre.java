package gof23.abstractFactory.tyre;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public class LowTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("不耐磨！");
    }
}
