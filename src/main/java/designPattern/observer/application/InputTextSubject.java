package designPattern.observer.application;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.Observable;

/**
 * Created by: Yang
 * Date: 2018-03-22
 * Time: 20:29
 */
public class InputTextSubject extends Observable {
    String context;
    JTextArea text;

    InputTextSubject() {
        text = new JTextArea(10, 15);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);

        (text.getDocument()).addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                context = text.getText();
                setChanged();
                notifyObservers(context);
            }
        });
    }

    public String getContext() {
        return context;
    }

    public JTextArea getText() {
        return text;
    }
}
