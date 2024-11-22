package ua.com.kisit_course.groupe373.unit10.v4;

public class MyThread implements Runnable {

    public Res res;

    public MyThread(Res res) {
        this.res = res;
    }

    @Override
    public void run() {

        synchronized (res) {
            res.x = 1;

            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + res.x);
                res.x++;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
