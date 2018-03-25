package designPattern.observer.application;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * Created by: Yang
 * Date: 2018-03-22
 * Time: 21:04
 */
public class ShowDigit extends JPanel implements Observer {

    Observable subject;
    JTextArea text;
    Vector<String> vector;

    public ShowDigit(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
        text = new JTextArea(10, 15);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setEditable(false);
        add(new JScrollPane(text));
        vector = new Vector<String>();
    }

    @Override
    public void update(Observable subject, Object object) {
        text.setText(null);
        text.append("出现的数字有：\n");
        vector.removeAllElements();
        String content = object.toString();
        String regex = "\\D+"; //非数字字符构成的正则表达式
        String digitWords[] = content.split(regex);
        for (int i = 0; i < digitWords.length; i++) {
            if (!vector.contains(digitWords[i])) {
                vector.add(digitWords[i]);
            }
        }

        for (int i = 0; i < vector.size(); i++) {
            text.append(vector.elementAt(i) + " ");
        }
    }
}
