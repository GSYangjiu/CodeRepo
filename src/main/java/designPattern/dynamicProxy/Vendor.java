package designPattern.dynamicProxy;

/**
 * @author Yang.
 * email : vincent1094259423@yahoo.com
 * date  : 2018-12-03 14:37
 * description:
 */
public class Vendor implements Sell {
    @Override
    public void sell() {
        System.out.println("In sell method");
    }

    @Override
    public void ad() {
        System.out.println("ad method");
    }
}
