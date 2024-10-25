package ua.com.kisit_course.groupe371.unit7;

import ua.com.kisit_course.groupe371.unit7.singleton.MySingleton;

import java.util.Calendar;
import java.util.Timer;

public class MyClock {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println(hour + ":" + minute + ":" + second);


        MySingleton singleton1 = MySingleton.getInstance();
        singleton1.print();

        MySingleton singleton2 = MySingleton.getInstance();
        singleton2.print();



//        Timer timer = new Timer();
//        timer.schedule(new TimerClock(), 1000, 1000);



    }

}
