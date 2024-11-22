package ua.com.kisit_course.groupe373.unit10.v3;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new MyThread(), "Thread " + (i+1) );
            thread.start();
        }

    }

}
