package ua.com.kisit_course.groupe371.unit10.v2;

public class Main {

    public static void main(String[] args) {

        System.out.println("Запуск головного потоку");


        MyThread thread = new MyThread("Мій потік!!");
        thread.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Завершення роботи головного потоку");


    }

}
