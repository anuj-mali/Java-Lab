package Unit2;

// border layout places the content into five regions: north, south, east, west, center
// by default, the content is placed in the center
// if you add more than one component to a region, the last one added is the one that is displayed

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Border extends JFrame {
    JButton b1, b2, b3, b4, b5;

    public void setBorder() {
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);

        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
    }
}

public class BorderLayoutDemo {
    public static void main(String[] args) {
        Border b = new Border();
        b.setBorder();
    }
}
