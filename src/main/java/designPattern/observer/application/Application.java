package designPattern.observer.application;

import javax.swing.*;
import java.awt.*;

/**
 * Created by: Yang
 * Date: 2018-03-22
 * Time: 21:13
 */
public class Application extends JFrame {
    Application(){
        InputTextSubject textSubject = new InputTextSubject();
        ShowWord observerOne = new ShowWord(textSubject);
        ShowDigit observerTwo = new ShowDigit(textSubject);
        setLayout(new FlowLayout());
        add(new JScrollPane(textSubject.getText()));
        add(observerOne);
        add(observerTwo);
        setBounds(20,20,400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Application();
    }
}
