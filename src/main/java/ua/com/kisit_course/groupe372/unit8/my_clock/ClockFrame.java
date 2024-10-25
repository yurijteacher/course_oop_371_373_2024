package ua.com.kisit_course.groupe372.unit8.my_clock;

import javax.swing.*;

public class ClockFrame {

    // | AWT | Swing |--> FX
    // Frame | JFrame
    // Panel | JPanel
    // Button | JButton
    // ...
    // Layout
    // Listener

    JFrame frame;
    JPanel panel;
    JLabel label;

    public ClockFrame() {
        frame = new JFrame("My Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        label = new JLabel();

        frame.add(panel);
        panel.add(label);

        frame.setSize(400, 60);


        ClockExt2 clock = new ClockExt2(10,1,1,0);

//        Timer timer = new Timer(100, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                clock.nextMs();
//                label.setText(clock.toString());
//            }
//        });

        Timer timer = new Timer(100, e -> {
            clock.nextMs();
            label.setText(clock.toString());
        });

        timer.start();

        frame.setVisible(true);
    }
}
