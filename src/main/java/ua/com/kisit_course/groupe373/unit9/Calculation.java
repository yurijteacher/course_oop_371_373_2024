package ua.com.kisit_course.groupe373.unit9;

import javax.swing.*;
import java.awt.*;
import java.util.stream.Stream;

/*
--------------------
-Calculation----- -X
--------------------
      display
--------------------
7  8  9  +
4  5  6  -
1  2  3  *
0  .  =  /
--------------------

 */

public class Calculation {

    JFrame frame;
    JPanel panel;
    JTextField display;

    String operation = "";
    double first = 0;
    double second = 0;

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;

    public Calculation() {

        frame = new JFrame("Calculation");
        display = new JTextField();
        panel = new JPanel();

        b13 = new JButton("7");
        b14 = new JButton("8");
        b15 = new JButton("9");
        b16 = new JButton("+");

        b9 = new JButton("4");
        b10 = new JButton("5");
        b11 = new JButton("6");
        b12 = new JButton("-");

        b5 = new JButton("1");
        b6 = new JButton("2");
        b7 = new JButton("3");
        b8 = new JButton("*");

        b1 = new JButton("0");
        b2 = new JButton(".");
        b3 = new JButton("=");
        b4 = new JButton("/");

        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);

        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);

        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);

        GridLayout gridLayout = new GridLayout(4, 4);  // table[4, 4]
        panel.setLayout(gridLayout);

        frame.add(display, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);

        Stream.of(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,display).forEach(
                el-> el.setFont(new Font("Times New Roman", Font.PLAIN, 25))
        );
//
//        b1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                display.setText(display.getText()+"0");
//            }
//        });


//        b1.addActionListener(e -> display.setText(display.getText()+"0"));

        Stream.of(b1,b5,b6,b7,b9,b10,b11,b13,b15,b16).forEach(el-> {
           el.addActionListener(e1 -> {
               char[] arr = display.getText().toCharArray();
//               if(arr[0]=='0' && arr[1]!='.'){
//                   display.setText(display.getText().substring(0,display.getText().length()-1));
//               }

               display.setText(display.getText()+el.getText());
           });
        });

        b2.addActionListener(e->{

            char[] arr = display.getText().toCharArray();
            boolean logic = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '.') {
                    logic = true;
                }
            }
            if(!logic) display.setText(display.getText()+".");
        });

        Stream.of(b4,b8,b12,b16).forEach(
                el->el.addActionListener(e->{
                    operation = el.getText();
//                    first = Double.valueOf(el.getText());
                    first = Double.parseDouble(display.getText());
                    display.setText("0");
                })
        );

        b3.addActionListener(e -> {

            second = Double.parseDouble(display.getText());

            switch(operation) {
                case ("+"): display.setText(String.valueOf(first+second));
                    break;
                case ("-"): display.setText(first-second + "");
                    break;
                case ("*"): display.setText(first*second + "");
                    break;
                case ("/"): display.setText(String.valueOf((second!=0) ? first/second : 0));
                    break;
            }
        });

        frame.setVisible(true);
    }
}
