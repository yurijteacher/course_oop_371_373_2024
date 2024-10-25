package ua.com.kisit_course.groupe372.unit8.my_clock;

import java.util.TimerTask;

public class MyClock2 extends TimerTask {

    ClockExt2 clockExt2 = new ClockExt2(10,10,1,0);

    @Override
    public void run() {
        clockExt2.nextMs();
        System.out.println(clockExt2.toString());
    }
}
