package ua.com.kisit_course.groupe373.unit10.v1;

public class MyThread extends Thread {


    @Override
    public void run() {

        System.out.println("Запуск парального потоку" + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("!!");
        }

        System.out.println("Завершення паралельного потоку"  + Thread.currentThread().getName());

    }


}
