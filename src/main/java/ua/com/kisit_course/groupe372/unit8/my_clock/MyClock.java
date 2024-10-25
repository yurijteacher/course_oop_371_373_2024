package ua.com.kisit_course.groupe372.unit8.my_clock;

import java.util.TimerTask;

public class MyClock extends TimerTask {

    ClockExt clockExt = new ClockExt(10,1,1);

    @Override
    public void run() {
        clockExt.nextSecond();
        System.out.println(clockExt.toString());
    }
}
