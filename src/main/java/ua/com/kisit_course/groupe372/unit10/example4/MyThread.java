package ua.com.kisit_course.groupe372.unit10.example4;

public class MyThread implements Runnable{



    @Override
    public void run() {
        System.out.println(">> " + Thread.currentThread().getName());

        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
           e.printStackTrace();
            System.out.println("!!");
        }


        System.out.println("<< " + Thread.currentThread().getName());
    }



}
