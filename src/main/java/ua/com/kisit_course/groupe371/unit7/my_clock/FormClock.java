package ua.com.kisit_course.groupe371.unit7.my_clock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormClock {

    // AWT      / Swing -> FX
    // Frame    // JFrama
    // Panel    // JPanel
    // Button   // JButton
    // TextField// JTextField
    // Sector..
    //

    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    public FormClock() {

        JFrame frame = new JFrame();
        frame.setTitle("My Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 60);

        panel = new JPanel();
        frame.add(panel);

        label = new JLabel();
        panel.add(label);

        ClockExt clockExt = new ClockExt(10,10,1);
// v.1
//        Timer timer = new Timer(1000, new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                clockExt.nextSecond();
//                label.setText(clockExt.toString());
//            }
//        });

        Timer timer = new Timer(1000, e -> {
            clockExt.nextSecond();
            label.setText(clockExt.toString());
        });

        timer.start();


        frame.setVisible(true);
    }



}
