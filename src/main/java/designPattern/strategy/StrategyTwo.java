package designPattern.strategy;

/**
 * Created by: Yang
 * Date: 2018-03-25
 * Time: 21:29
 */
public class StrategyTwo implements ComputableStrategy {
    @Override
    public double computeScore(double[] a) {
        double score = 0, multi = 1;
        int n = a.length;
        for (double i : a) {
            multi *= i;
        }
        score = Math.pow(multi, 1.0 / n);
        return score;
    }
}
