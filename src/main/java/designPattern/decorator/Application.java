package designPattern.decorator;

/**
 * Created by: Yang
 * Date: 2018-03-25
 * Time: 0:41
 */
public class Application {
    public void needBird(Bird bird) {
        int flyDistance = bird.fly();
        System.out.println("这只鸟能飞行" + flyDistance + "米");
    }

    public static void main(String[] args) {
        Application test = new Application();
        Bird sparrow = new Sparrow();
        Bird sparrowDecorator1 = new SparrowDecorator(sparrow);
        Bird sparrowDecorator2 = new SparrowDecorator(sparrowDecorator1);

        test.needBird(sparrow);
        test.needBird(sparrowDecorator1);
        test.needBird(sparrowDecorator2);
    }
}
