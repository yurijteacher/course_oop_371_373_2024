package ua.com.kisit_course.groupe371.unit10.v6;

public class MyThread implements Runnable{

    Thread thread;
    String name;

    public MyThread(String name) {
        thread = new Thread(this, name);
        this.name = name;
        thread.start();
    }

    @Override
    public void run() {

        new BattleOfTitans();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
