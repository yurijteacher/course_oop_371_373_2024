package ua.com.kisit_course.groupe373.unit10.v1;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Запуск головного потоку");

        MyThread myThread = new MyThread();
        myThread.start();

        Thread.sleep(200);


        System.out.println("Завершення роботи головного ппотоку");
    }


}
