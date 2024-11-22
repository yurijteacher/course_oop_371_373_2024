package ua.com.kisit_course.groupe371.unit10.v4;

import ua.com.kisit_course.groupe371.unit10.v3.MyThread;

public class Main {

    public static void main(String[] args) {

        System.out.println(">>");


        MyThread myThread = new MyThread("Потік");

            Thread mythread = new Thread(myThread);
            mythread.start();

        System.out.println("<<");
    }

}
