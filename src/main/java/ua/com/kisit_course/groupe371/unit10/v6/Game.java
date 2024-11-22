package ua.com.kisit_course.groupe371.unit10.v6;

import java.util.TimerTask;

public class Game extends TimerTask {


    @Override
    public void run() {
        System.out.println("Запуск гри");

        MyThread raund1 = new MyThread("Raund 1");
        MyThread raund2 = new MyThread("Raund 2");
        MyThread raund3 = new MyThread("Raund 3");
        MyThread raund4 = new MyThread("Raund 4");

        // послідовний запуск
        try {

            raund1.thread.join();
            raund2.thread.join();
            raund3.thread.join();
            raund4.thread.join();

    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
//        raund1.thread.run();
//        raund2.thread.run();
//        raund3.thread.run();
//        raund4.thread.run();

        System.out.println("Завершення гри");
    }
}
