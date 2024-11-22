package ua.com.kisit_course.groupe371.unit10.v6;

import java.util.Timer;

public class Main {

    public void start(){
        Timer timer = new Timer();
        timer.schedule(new Game(), 0, 1000);
    }



    public static void main(String[] args) {
        new Main().start();
    }


}
