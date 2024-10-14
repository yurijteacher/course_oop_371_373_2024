package ua.com.kisit_course.groupe373.unit8.my_clock;

import javax.swing.*;

public class FrameClock {

    //
    // AWT | Swing -> Java FX
    //

    JFrame frame;
    JPanel panel;
    JLabel label;

    public FrameClock() {
        this.frame = new JFrame("My Clock");
        this.panel = new JPanel();
        this.label = new JLabel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 60);

        frame.add(panel);
        panel.add(label);

        ClockExt2 clock = new ClockExt2(15,1,10,0);

//        Timer timer = new Timer(100, new ActionListener() {
//
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
