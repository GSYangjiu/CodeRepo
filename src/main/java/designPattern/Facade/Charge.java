package designPattern.Facade;

/**
 * Created by: Yang
 * Date: 2018-03-29
 * Time: 20:12
 */
public class Charge {
    public final int basicCharge = 12;
    CheckWord checkWord;

    Charge(CheckWord checkWord) {
        this.checkWord = checkWord;
    }

    public void giveCharge() {
        int charge = checkWord.getAmount() * basicCharge;
        System.out.println("广告费用：" + charge + "元");
    }
}
