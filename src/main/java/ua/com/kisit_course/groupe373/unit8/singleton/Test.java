package ua.com.kisit_course.groupe373.unit8.singleton;

public class Test {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        singleton1.print();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.print();

    }

}
