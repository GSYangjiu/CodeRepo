package designPattern.observer;

/**
 * Created by: Yang
 * Date: 2018-03-13
 * Time: 20:29
 */
public class Test {
    public static void main(String[] args) {
        SeekjobCenter center = new SeekjobCenter();
        UniversityStudent zhangLin = new UniversityStudent(center, "A.txt");
        HaiGui wangHao = new HaiGui(center,"B.txt");
        center.giveNewMess("腾辉公司需要10个程序员，");
        center.notifyObserver();
        center.giveNewMess("海景公司需要8个动画设计师");
        center.notifyObserver();
        center.giveNewMess("海仁公司需要9个电工");
        center.notifyObserver();
        center.giveNewMess("海仁公司需要9个电工");
        center.notifyObserver();

    }
}
