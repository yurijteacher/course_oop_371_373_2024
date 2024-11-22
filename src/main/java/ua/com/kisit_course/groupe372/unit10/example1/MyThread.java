package ua.com.kisit_course.groupe372.unit10.example1;

public class MyThread extends Thread {

    public static void main(String[] args) {

        Thread thread = Thread.currentThread();
        thread.setName("MyThread");

        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.isDaemon());
        System.out.println(thread.isAlive());
        System.out.println(thread.getState());



    }

}
