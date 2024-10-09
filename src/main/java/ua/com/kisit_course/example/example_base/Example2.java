package ua.com.kisit_course.example.example_base;

import reactor.core.publisher.Flux;

/*
    2. Операції з потоком даних
    Reactor надає безліч операцій для обробки даних,
    таких як map, flatMap, filter, тощо.
 */

public class Example2 {

//    public static void main(String[] args) {
//        Flux<Integer> numbers = Flux.range(1, 5);
//
//        numbers.map(num -> num * 2)  // Множимо кожен елемент на 2
//                .filter(num -> num % 3 == 0)  //
//                // Фільтруємо числа, що діляться на 3
//                .subscribe(System.out::println);
//    }

    public static void main(String[] args) {

        Flux<Integer> numbers = Flux.range(1, 10);

        numbers.map(i -> i * 2)
                .filter(number -> number % 3 == 0)
                .subscribe(System.out::println);



    }

}
