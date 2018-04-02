package designPattern.facade;

/**
 * Created by: Yang
 * Date: 2018-03-29
 * Time: 20:09
 */
public class CheckWord {
    public final int basicAmount = 85;
    String advertisment;
    int amount;

    public CheckWord(String advertisment) {
        this.advertisment = advertisment;
    }

    public int getAmount() {
        return amount;
    }

    public void setChargeAmount() {
        this.amount = basicAmount + advertisment.length();
    }
}
