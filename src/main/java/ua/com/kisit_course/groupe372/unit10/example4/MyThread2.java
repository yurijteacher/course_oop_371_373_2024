package ua.com.kisit_course.groupe372.unit10.example4;

public class MyThread2 {

    public static void main(String[] args) {

        System.out.println(">>");

        Runnable runnable = ()->{

            System.out.println("Запуск паралельного потоку " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("! Err");
            }
            System.out.println("Заверешення роботи паралельного потоку " + Thread.currentThread().getName());
        };


        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable, " Name "+ (i+1));
            thread.start();
        }

        System.out.println("<<");

    }


}
