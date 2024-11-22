package ua.com.kisit_course.groupe372.unit10.example3;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println("Запуск дочірнього " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Переривання у роботі потоку");
        }


        System.out.println("Завершення роботу дочірнього потоку" + Thread.currentThread().getName());
    }



}
