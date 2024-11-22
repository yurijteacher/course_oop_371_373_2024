package ua.com.kisit_course.groupe372.unit10.example2;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Початок роботи потоку " + Thread.currentThread().getName());


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Переривання у роботі потоку");
        }


        System.out.println("Завершення роботи потоку " + Thread.currentThread().getName());
    }

}
