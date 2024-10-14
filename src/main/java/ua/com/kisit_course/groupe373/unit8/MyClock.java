package ua.com.kisit_course.groupe373.unit8;

import java.util.Calendar;
import java.util.Timer;

public class MyClock {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println(hour + ":" + minute + ":" + second);

        Timer timer = new Timer();
        timer.schedule(new MyClock2(), 1000,1000);




    }


}
