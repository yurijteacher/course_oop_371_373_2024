package ua.com.kisit_course.example.example_base;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/*
    3. Використання flatMap для асинхронних операцій
    Операція flatMap корисна для асинхронної обробки,
    коли кожен елемент потоку може породжувати інший реактивний потік.
 */

public class Example3 {

//    public static void main(String[] args) {
//        Flux<String> names = Flux.just("Johns", "Jane", "Jack");
//
//        names.flatMap(name -> getLengthAsync(name))  // Асинхронно отримуємо довжину імені
//                .subscribe(length -> System.out.println("Length: " + length));
//    }
//
//    // Функція, яка асинхронно повертає довжину рядка
//    public static Mono<Integer> getLengthAsync(String name) {
//        return Mono.just(name.length());
//    }


    public static void main(String[] args) {

        Flux<String> names = Flux.just("Ivan", "Ivanka", "Vasya");

        names.flatMap(name -> getLengthName(name))
                .subscribe(length-> System.out.println("Length:" + length));
    }

    private static Mono<Integer> getLengthName(String name) {
        return Mono.just(name.length());
    }

}
