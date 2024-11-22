package ua.com.kisit_course.groupe372.unit10.example6;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new Game(), 0, 1000);

    }

}
