package ua.com.kisit_course.groupe373.unit10.v2;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Запуск головного потоку");

        Thread thread = new Thread(new MyThread(), "MY THREAD!!");
        thread.start();

        Thread.sleep(100);

        System.out.println("Завершення роботи головного потоку");

    }

}
