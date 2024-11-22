package ua.com.kisit_course.groupe373.unit10.v5;

import io.netty.util.Timeout;
import io.netty.util.TimerTask;

public class Game implements TimerTask {

    @Override
    public void run(Timeout timeout) throws Exception {

        MyThread thread1 = new MyThread("Raund 1");
        MyThread thread2 = new MyThread("Raund 2");
        MyThread thread3 = new MyThread("Raund 3");
        MyThread thread4 = new MyThread("Raund 4");


        try {
            thread1.thread.join();
            thread2.thread.join();
            thread3.thread.join();
            thread4.thread.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
