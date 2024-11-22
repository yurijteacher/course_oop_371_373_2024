package ua.com.kisit_course.groupe373.unit10.v2;

public class MyThread implements Runnable{



    @Override
    public void run() {
        System.out.println("Запуск ... " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Завершення ... " + Thread.currentThread().getName());
    }
}
