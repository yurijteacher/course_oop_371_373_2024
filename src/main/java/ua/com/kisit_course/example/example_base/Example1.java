package ua.com.kisit_course.example.example_base;

import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

/*
    1. Створення Mono і Flux
    Mono та Flux є основними будівельними блоками в Reactor.
    Mono може містити максимум один елемент, тоді як Flux — багато.
 */

public class Example1 {

//    public static void main(String[] args) {
//        // Створення Mono з одним елементом
//        Mono<String> mono = Mono.just("Hello, Mono!");
//        mono.subscribe(System.out::println);
//
//        // Створення порожнього Mono
//        Mono<String> emptyMono = Mono.empty();
//        emptyMono.subscribe(System.out::println,
//                Throwable::printStackTrace,
//                () -> System.out.println("Completed!"));
//
//        // Створення Flux з кількома елементами
//        Flux<String> flux = Flux.just("Hello", "from", "Flux!");
//        flux.subscribe(System.out::println);
//    }

    public static void main(String[] args) {

        Mono<String> mono = Mono.just("Hello, Student!");
        mono.subscribe(System.out::println);


        Mono<String> mono2 = Mono.empty();

        mono2.subscribe(
                System.out::println,                    // 1. Обробка значень
                Throwable::printStackTrace,             // 2. Обробка помилок
                ()-> System.out.println("Complete!")    // 3. Обробка завершення
        );


        Flux<String> flux = Flux.just("Hello","From", "World");
        flux.subscribe(System.out::println);

    }



}
