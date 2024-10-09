package ua.com.kisit_course.example.projectreactor;

import java.util.List;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) {

        List<String> fruits = Stream.of("apple", "orange", "banana")
                .filter(e->e.equals("apple") || e.equals("orange"))
                .map(e-> e + " fruits")
                .toList();

        fruits.parallelStream().forEach(System.out::println);



    }
}
