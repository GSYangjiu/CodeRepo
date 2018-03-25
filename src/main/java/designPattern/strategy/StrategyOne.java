package designPattern.strategy;

/**
 * Created by: Yang
 * Date: 2018-03-25
 * Time: 21:27
 * Description: 具体策略，实现策略定义的抽象方法
 */
public class StrategyOne implements ComputableStrategy {
    @Override
    public double computeScore(double[] a) {
        double score = 0, sum = 0;
        for (double anA : a) {
            sum += anA;
        }
        score = sum / a.length;
        return score;
    }
}
