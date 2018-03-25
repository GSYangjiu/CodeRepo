package designPattern.strategy;

import java.util.Arrays;

/**
 * Created by: Yang
 * Date: 2018-03-25
 * Time: 21:31
 */
public class StrategyThree implements ComputableStrategy {
    @Override
    public double computeScore(double[] a) {
        if (a.length <= 2) return 0;
        double score = 0, sum = 0;
        Arrays.sort(a);
        for (int i = 1; i < a.length - 1; i++) {
            sum += a[i];
        }
        score = sum / (a.length - 2);
        return score;
    }
}
