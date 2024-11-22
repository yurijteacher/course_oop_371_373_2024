package ua.com.kisit_course.groupe372.unit10.example4;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Запуск головного потоку");

        Thread thread = new Thread(new MyThread(), "My Thread");
        thread.start();

        Thread.sleep(200);

        System.out.println("Завершення головного потоку");


    }


}
