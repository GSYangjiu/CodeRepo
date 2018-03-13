package designPattern.observer;

import java.util.ArrayList;

/**
 * Created by: Yang
 * Date: 2018-03-13
 * Time: 20:07
 */
public class SeekjobCenter implements Subject {
    String mess;
    boolean changed;
    ArrayList<Observer> personList;

    SeekjobCenter() {
        personList = new ArrayList<Observer>();
        mess = "";
        changed = false;
    }

    @Override
    public void addObserver(Observer o) {
        if (!personList.contains(o)) {
            personList.add(o);
        }
    }

    @Override
    public void deleteObserver(Observer o) {
        if (personList.contains(o)) {
            personList.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        if (changed) {
            for (Observer observer : personList) {
                observer.hearTelephone(mess);
            }
            changed = false;
        }
    }

    public void giveNewMess(String str){
        if (str.equals(mess))
            changed = false;
        else {
            mess = str;
            changed = true;
        }
    }
}
