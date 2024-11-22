package ua.com.kisit_course.groupe371.unit10.v4;

public class MyThread2 {

    public static void main(String[] args) {

        System.out.println("Запуск головного потоку");

        Runnable runnable =()->{
            System.out.println(">> Запуск паралельного потоку " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("!!!");
            }

            System.out.println("<< Завершення роботи головного потоку " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(runnable, "MyThread!!");
        thread.start();

        System.out.println("Завершення головного потоку");
    }


}
