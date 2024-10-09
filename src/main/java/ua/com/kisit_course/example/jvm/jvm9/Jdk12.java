package ua.com.kisit_course.example.jvm.jvm9;

import java.util.List;
import java.util.stream.Collectors;

public class Jdk12 {
    public static void main(String[] args) {

        var str = "Hello";
        var update = str.transform(s -> s.toUpperCase());
        System.out.println(update);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var sum1 = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        var sum2 = numbers.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(sum1 + "," + sum2);


        var sum3 = numbers.stream().collect(Collectors.teeing(
                        Collectors.summingInt(Integer::intValue),
                        Collectors.averagingInt(Integer::intValue),
                        (sum, avg) -> "Sum: " + sum + ", Avg: " + avg
                )
        );

        System.out.println(sum3);

    }
}
