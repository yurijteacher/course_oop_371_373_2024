package ua.com.kisit_course.groupe373.unit8;

import java.util.Calendar;
import java.util.TimerTask;

public class MyClock2 extends TimerTask {

    @Override
    public void run() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println(hour + ":" + minute + ":" + second);
    }
}
