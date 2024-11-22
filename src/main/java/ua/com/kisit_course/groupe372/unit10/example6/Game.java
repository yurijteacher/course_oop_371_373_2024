package ua.com.kisit_course.groupe372.unit10.example6;

import java.util.TimerTask;

public class Game extends TimerTask {


    @Override
    public void run() {
        System.out.println("Запуск гри");

        MyThread thread1 = new MyThread("Raund 1");
        MyThread thread2 = new MyThread("Raund 2");

        // паралельний варіант проходження двох раундів
//        thread1.thread.run();
//        thread2.thread.run();

        // послідовний варіант проходження двох раундів
        try {
            thread1.thread.join();
            thread2.thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Завершення гри");
    }
}
