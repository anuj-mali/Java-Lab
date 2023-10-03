package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UserInput extends JFrame {
    JLabel l1, l2, outputLbl;
    JTextField t1, t2;
    JButton b1, b2;

    public void setInput() {
        l1 = new JLabel("Enter first number: ");
        l2 = new JLabel("Enter second number");
        outputLbl = new JLabel("");
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        b1 = new JButton("Add");
        b2 = new JButton("Subtract");

        // Adding component into window
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(outputLbl);

        // set window properties
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(220, 300);

        // handling event generated from button
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                if (ae.getSource() == b1) {
                    int sum = num1 + num2;
                    outputLbl.setText("Sum = " + sum);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                if (ae.getSource() == b2) {
                    int diff = num1 - num2;
                    outputLbl.setText("Difference = " + diff);
                }
            }
        });

    }
}

public class UserInputDemo {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        ui.setInput();
    }
}
