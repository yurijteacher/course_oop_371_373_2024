package ua.com.kisit_course.example.jvm.jvm9;

public class Jdk17 {

    // Надання дозволу на наслідування
    static  sealed class Parent permits Child1, Child2, Child3 {
    }

    static final class Child1 extends Parent {
    }

    static final class Child2 extends Parent {
    }

    static final class Child3 extends Parent {
    }

//    static final class Child4 extends Parent {
//    }
}
