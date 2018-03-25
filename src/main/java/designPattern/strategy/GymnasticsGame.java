package designPattern.strategy;

/**
 * Created by: Yang
 * Date: 2018-03-25
 * Time: 21:35
 * Description: 上下文，包含策略声明的变量，此变量可用于保存具体的策略的引用
 */
public class GymnasticsGame {
    ComputableStrategy strategy;

    public void setStrategy(ComputableStrategy strategy) {
        this.strategy = strategy;
    }

    public double getPersonScore(double[] a) {
        if (strategy != null) {
            return strategy.computeScore(a);
        } else {
            return 0;
        }
    }
}
