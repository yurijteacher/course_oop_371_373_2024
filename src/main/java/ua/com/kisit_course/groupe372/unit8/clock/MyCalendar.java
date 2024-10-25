package ua.com.kisit_course.groupe372.unit8.clock;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class MyCalendar {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int hour = calendar.get(Calendar.HOUR);
            int minute = calendar.get(Calendar.MINUTE);
            int second = calendar.get(Calendar.SECOND);
            int millisecond = calendar.get(Calendar.MILLISECOND);

            // DAYS.DAY

        System.out.println(year + " " + month + " " + day + " " + hour + " " + minute + " " + second + " " + millisecond);


        Timer timer = new Timer();
        timer.schedule(new TimerClock(), 1000,1000);

        Date date = new Date();
        System.out.println(date);


    }


}
