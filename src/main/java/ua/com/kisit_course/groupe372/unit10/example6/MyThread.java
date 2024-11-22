package ua.com.kisit_course.groupe372.unit10.example6;

public class MyThread implements Runnable{

    Thread thread;
    String name;

    public MyThread(String name) {
        this.thread = new Thread(this, name);
        this.name = name;
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
