package designPattern.command;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-04-02 11:47
 * Description:
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock stock) {
        this.abcStock = stock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
