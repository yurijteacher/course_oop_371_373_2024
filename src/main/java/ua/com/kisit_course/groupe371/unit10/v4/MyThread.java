package ua.com.kisit_course.groupe371.unit10.v4;

public class MyThread implements Runnable{


    @Override
    public void run() {
        System.out.println("Запуск паралельного потоку" + Thread.currentThread().getName());


        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Завершення роботи паралельного потоку" + Thread.currentThread().getName());
    }
}
