package Unit2;

import javax.swing.*;
import java.awt.*;

// place the content in form of rectangular grid with row and col
// we can specify how the content should be placed in the grid
//  how much cell to give for content

// to specify the content GridBagConstraint class is used
class GridBag extends JFrame {
    JButton b1, b2, b3, b4, b5, b6;

    public void setGridBag() {
        b1 = new JButton("Button1");
        b2 = new JButton("Button2");
        b3 = new JButton("Button3");
        b4 = new JButton("Button4");
        b5 = new JButton("Button5");
        b6 = new JButton("Button6");

        // adding grid bag layout
        GridBagLayout gbl = new GridBagLayout();

        // adding constraints
        GridBagConstraints gbc = new GridBagConstraints();

        setVisible(true);
        setSize(500, 500);
        setLayout(gbl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adding b1 in 0,0
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(b1, gbc);

        // adding b2 in 1,0
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(b2, gbc);

        // adding b3 in 0,1
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(b3, gbc);

        // adding b4 in 0,2
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        add(b4, gbc);

        // adding b5 in 1,2
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(b5, gbc);

        // adding b6 in 0,3
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(b6, gbc);

    }
}

public class GridBagLayoutDemo {
    public static void main(String[] args) {
        GridBag gb = new GridBag();
        gb.setGridBag();
    }
}
