package ua.com.kisit_course.groupe371.unit10.v3;

public class Main {

    public static void main(String[] args) {

        System.out.println("Запуск головного потоку");

        for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread("Name"+ (i+1));
            myThread.start();
        }

        System.out.println("Завершення головного потоку");
    }

}
