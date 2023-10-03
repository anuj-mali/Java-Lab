package Unit2;

import javax.swing.*;
import java.awt.*;

class SwingComponent extends JFrame {
    JLabel usernameLabel, passwordLabel, repasswordLabel, genderLabel, courseLabel;
    JTextField usernameText;
    JPasswordField passwordText, repasswordText;
    JRadioButton maleRadio, femaleRadio;
    JCheckBox c1, c2, c3;
    JButton submitButton;

    public void setComponent() {
        // Creating JLabel Object
        usernameLabel = new JLabel("username");
        passwordLabel = new JLabel("password");
        repasswordLabel = new JLabel("repassword");
        genderLabel = new JLabel("gender");
        courseLabel = new JLabel("course");

        // Creating object for TextField
        usernameText = new JTextField(15);
        passwordText = new JPasswordField(15);
        repasswordText = new JPasswordField(15);

        // Radio button
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");

        // Check box
        c1 = new JCheckBox("C");
        c2 = new JCheckBox("C++");
        c3 = new JCheckBox("Java");

        // Button
        submitButton = new JButton("Submit");

        // Creating group for radio button
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        // Adding components to JFrame
        add(usernameLabel);
        add(usernameText);
        add(passwordLabel);
        add(passwordText);
        add(repasswordLabel);
        add(repasswordText);
        add(genderLabel);
        add(maleRadio);
        add(femaleRadio);
        add(courseLabel);
        add(c1);
        add(c2);
        add(c3);
        add(submitButton);

        // Adding features of window
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
    }
}

public class SwingDemo {
    public static void main(String[] args) {
        SwingComponent s1 = new SwingComponent();
        s1.setComponent();
    }

}
