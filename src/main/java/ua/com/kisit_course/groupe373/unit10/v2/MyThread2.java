package ua.com.kisit_course.groupe373.unit10.v2;

public class MyThread2 {

    public static void main(String[] args) {

        Runnable runnable = ()->{
            System.out.println("Запуск палельного потоку" + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("!!!");
            }
            System.out.println("Заверешення" + Thread.currentThread().getName());
        };


        System.out.println("Запуск головного потоку");
        Thread thread = new Thread(runnable, "MY!!!");
        thread.start();
        System.out.println("Завершення");
    }


}
