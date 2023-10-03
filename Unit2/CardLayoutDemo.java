package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Card extends JFrame {
    JButton b1, b2, b3, b4, b5;
    JPanel p1;

    public void setCard() {
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        // b5 = new JButton("Button 5");

        p1 = new JPanel();

        CardLayout cl = new CardLayout();
        p1.setLayout(cl);

        p1.add(b1, "but1");
        p1.add(b2, "but2");
        p1.add(b3, "but3");
        p1.add(b4, "but4");

        add(p1);

        // showing next component
        cl.next(p1);

        // showing previous component
        cl.previous(p1);

        // showing specific component
        // cl.show(p1, "but3");

        // showing each component when button is clicked
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.next(p1);
            }
        });

        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

public class CardLayoutDemo {
    public static void main(String[] args) {
        Card c = new Card();
        c.setCard();
    }
}
