package org.example;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.*;
import javax.swing.JLabel;
import java.awt.event.*;

public class GUI implements ActionListener {

    public GUI() {
        JFrame frame = new JFrame();
        JButton button = new JButton("sadf");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("yay..");
        panel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        button.addActionListener(this);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Yahaha mothershucker");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main() {
        new GUI();
    }

    public void  actionPerformed(ActionEvent e) {
        System.out.println("Yahaha");
    }
}
