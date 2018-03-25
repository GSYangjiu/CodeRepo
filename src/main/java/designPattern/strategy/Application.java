package designPattern.strategy;

/**
 * Created by: Yang
 * Date: 2018-03-25
 * Time: 21:39
 */
public class Application {
    public static void main(String[] args) {
        GymnasticsGame game = new GymnasticsGame(); // 创建上下文对象
        game.setStrategy(new StrategyOne());        // 使用策略一
        Person zhang = new Person();
        zhang.setName("张三");
        double[] a = {9.12, 9.25, 8.87, 9.99, 6.99, 7.88};
        Person li = new Person();
        li.setName("李四");
        double[] b = {9.15, 9.26, 8.97, 9.89, 6.97, 7.89};
        zhang.setScore(game.getPersonScore(a));
        li.setScore(game.getPersonScore(b));
        System.out.println("使用算术平均值方案：");
        System.out.printf("%s最后得分：%5.3f%n", zhang.getName(), zhang.getScore());
        System.out.printf("%s最后得分：%5.3f%n", li.getName(), li.getScore());

        game.setStrategy(new StrategyTwo());        // 上下文对象使用策略二
        zhang.setScore(game.getPersonScore(a));
        li.setScore(game.getPersonScore(b));
        System.out.println("使用集合平均值方案：");
        System.out.printf("%s最后得分：%5.3f%n", zhang.getName(), zhang.getScore());
        System.out.printf("%s最后得分：%5.3f%n", li.getName(), li.getScore());

        game.setStrategy(new StrategyThree());        // 上下文对象使用策略三
        zhang.setScore(game.getPersonScore(a));
        li.setScore(game.getPersonScore(b));
        System.out.println("使用（去掉最高、最低）算术平均值方案：");
        System.out.printf("%s最后得分：%5.3f%n", zhang.getName(), zhang.getScore());
        System.out.printf("%s最后得分：%5.3f%n", li.getName(), li.getScore());
    }
}

class Person {
    String name;
    double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}