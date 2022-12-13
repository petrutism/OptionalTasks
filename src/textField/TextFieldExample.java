package textField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldExample implements ActionListener {
    JTextField tf1, tf2, tf3;
    JButton b1, b2, b3, b4, b5, b6;

    public static void main(String[] args) {
        new TextFieldExample();
    }

    void fieldTitle(JFrame f, Component c, String title) {
        JLabel l = new JLabel(title);

        l.setBounds(c.getBounds().x, c.getBounds().y - 20, c.getWidth(), 20);

        f.add(l);
    }

    TextFieldExample() {
        JFrame f = new JFrame("Onutes kalkuliatorius");
        tf1 = new JTextField();
        tf1.setBounds(40, 50, 150, 20);
        fieldTitle(f, tf1, "Pirmas skaicius, a:");

        tf2 = new JTextField();
        tf2.setBounds(40, 100, 150, 20);
        fieldTitle(f, tf2, "Antras skaicius, b: ");

        tf3 = new JTextField();
        tf3.setBounds(40, 150, 150, 20);
        fieldTitle(f, tf3, "Rezultatas:");
        tf3.setEditable(false);

        b1 = new JButton("a + b");
        b1.setBounds(210, 20, 70, 40);
        b2 = new JButton("a - b");
        b2.setBounds(300, 20, 70, 40);
        b3 = new JButton("a * b");
        b3.setBounds(210, 80, 70, 40);
        b4 = new JButton("a / b");
        b4.setBounds(300, 80, 70, 40);
        b5 = new JButton("a ^ b");
        b5.setBounds(210, 140, 70, 40);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setSize(410, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        Double a = Double.parseDouble(s1);
        Double b = Double.parseDouble(s2);
        double c = 0;

        if (e.getSource() == b1) {
            c = a + b;
        } else if (e.getSource() == b2) {
            c = a - b;
        } else if (e.getSource() == b3) {
            c = a * b;
        } else if (e.getSource() == b4) {
            c = a / b;
        }else if (e.getSource() == b5) {
            c = Math.pow(a, b);
        }
        String result = String.valueOf(c);
        tf3.setText(result);
    }
}
