package ua.com.kisit_course.groupe371.unit10.v2;

public class MyThread extends Thread {

    public MyThread(String name) {
    super(name);
    }

    @Override
    public void run() {

        System.out.println("Запуск паралельного потоку" + Thread.currentThread().getName());



        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("!!!!");
        }

        System.out.println("Завершення роботу паралельного потоку" + Thread.currentThread().getName());


    }

}
