package ua.com.kisit_course.groupe373.unit10.v4;

public class Main {

    public static void main(String[] args) {

        Res res = new Res();


        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new MyThread(res), "Thread " + (i+1));
            thread.start();

        }
    }

}
