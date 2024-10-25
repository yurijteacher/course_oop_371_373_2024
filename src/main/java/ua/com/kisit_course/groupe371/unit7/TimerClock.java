package ua.com.kisit_course.groupe371.unit7;

import java.util.Calendar;
import java.util.TimerTask;

public class TimerClock extends TimerTask {

    @Override
    public void run() {
        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println(hour + ":" + minute + ":" + second);
    }
}
