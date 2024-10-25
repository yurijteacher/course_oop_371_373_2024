package ua.com.kisit_course.groupe371.unit7.my_clock;

import javax.swing.*;

public class FormClock2 {

    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    public FormClock2() {

        JFrame frame = new JFrame();
        frame.setTitle("My Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 60);

        panel = new JPanel();
        frame.add(panel);

        label = new JLabel();
        panel.add(label);

        ClockExt2 clockExt = new ClockExt2(10,10,1,0);
// v.1
//        Timer timer = new Timer(1000, new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                clockExt.nextSecond();
//                label.setText(clockExt.toString());
//            }
//        });

        Timer timer = new Timer(100, e -> {
            clockExt.nextMs();
            label.setText(clockExt.toString());
        });

        timer.start();


        frame.setVisible(true);
    }

}
