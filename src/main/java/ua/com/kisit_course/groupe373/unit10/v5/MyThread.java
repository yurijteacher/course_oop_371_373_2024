package ua.com.kisit_course.groupe373.unit10.v5;

public class MyThread implements Runnable{

    Thread thread;
    String name;

    public MyThread(String name) {
        this.name = name;
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        new BattleOfTitans();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
