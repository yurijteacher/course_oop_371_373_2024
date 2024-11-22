package ua.com.kisit_course.groupe373.unit10.v5;

import io.netty.util.TimerTask;
import ua.com.kisit_course.groupe371.unit10.v6.Game;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new Game(), 0, 1000);

    }
}
