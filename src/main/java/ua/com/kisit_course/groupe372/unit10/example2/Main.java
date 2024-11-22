package ua.com.kisit_course.groupe372.unit10.example2;

public class Main {

    public static void main(String[] args) {

        System.out.println("Запуск головного потоку");

        MyThread thread = new MyThread();
        thread.start();

        System.out.println("Завершення роботи головного потоку");

    }

}
