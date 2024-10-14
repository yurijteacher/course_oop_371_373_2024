package ua.com.kisit_course.groupe373.unit8.my_clock;

import java.util.TimerTask;

public class TimerClock2 extends TimerTask {

    ClockExt2 clockExt = new ClockExt2(10,1,1,0);

    @Override
    public void run() {
        clockExt.nextMs();
        System.out.println(clockExt);
    }
}
