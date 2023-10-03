package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingComponent2 extends JFrame {
    // Creating combo box: generate two event: action event and item event
    // action event is generated when combo box is clicked
    // item event is generated when item is selected
    JComboBox cb1;
    JLabel l1;

    public void setComponents() {
        String[] subject = {
                "Java", "DWDM", "DBA", "SPM", "POM", "Project"
        };
        cb1 = new JComboBox(subject);
        l1 = new JLabel("Result");
        add(cb1);
        add(l1);

        setVisible(true);
        setSize(200, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // handling event generated from combo box
        // item event
        cb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String item = (String) cb1.getSelectedItem();
                l1.setText("You selected " + item + " item");
            }
        });
    }
}

public class SwingControl2Demo {
    public static void main(String[] args) {
        SwingComponent2 sc = new SwingComponent2();
        sc.setComponents();
    }

}
