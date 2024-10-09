package ua.com.kisit_course.example.jvm.jvm9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Jdk16 {

    public static void main(String[] args) {
        Person1 person1 = new Person1("asd");
        System.out.println(person1);

        //до
        Object o = new String("hello");

        if(o instanceof String){
            String str = (String) o;
            System.out.println(str.repeat(3));
        }
        // після
        if(o instanceof String str && str.length() > 0){
            System.out.println(str.repeat(3));
        }

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        list.stream().map(n->n + " !").collect(Collectors.toList());
        list.stream().map(n->n + " !").toList();



    }
    record Person1(String name){}

    // незмінний клас
    static final class Person{

        private final System name;

        Person(System name) {
            this.name = name;
        }

        public System getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;
            return Objects.equals(getName(), person.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(getName());
        }
    }

}
