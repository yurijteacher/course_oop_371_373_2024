package ua.com.kisit_course.groupe373.unit10.v3;

public class MyThread implements Runnable {


    @Override
    public void run() {
        System.out.println("Запуск паралельного потоку" + Thread.currentThread().getName());;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Завершення паралельного потоку" + Thread.currentThread().getName());
    }
}
