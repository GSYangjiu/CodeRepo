package designPattern.observer;

/**
 * Created by: Yang
 * Date: 2018-03-13
 * Time: 19:54
 */
public interface Subject {
    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObserver();
}
