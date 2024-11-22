package ua.com.kisit_course.groupe372.unit10.example3;

public class Main {

    public static void main(String[] args) {

        System.out.println("Запуск головного потоку");

        for (int i = 0; i < 10; i++) {
            new MyThread("Name" + (i+1)).start();
        }

        System.out.println("Завершення роботи головного потоку");
    }


}
