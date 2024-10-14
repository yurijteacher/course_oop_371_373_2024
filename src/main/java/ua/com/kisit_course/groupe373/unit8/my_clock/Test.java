package ua.com.kisit_course.groupe373.unit8.my_clock;

import java.util.Timer;

public class Test {

    public static void main(String[] args) {

        Timer timer = new Timer();
//        timer.schedule(new TimerClock(), 1000, 1000);
        timer.schedule(new TimerClock2(), 1000,100);
    }

}
