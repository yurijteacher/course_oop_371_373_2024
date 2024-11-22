package ua.com.kisit_course.groupe371.unit10.v3;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        System.out.println("Запуск потоку" + Thread.currentThread().getName());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("!!!");
        }

        System.out.println("Завершення роботи" + Thread.currentThread().getName());
    }
}
