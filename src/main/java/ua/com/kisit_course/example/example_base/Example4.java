package ua.com.kisit_course.example.example_base;

import reactor.core.publisher.Mono;

/*
    4. Обробка помилок з onErrorResume
    У Reactor легко можна обробити помилки, використовуючи такі методи,
    як onErrorResume, onErrorReturn, і т.д.
    onErrorResume — це оператор, який використовується для
    обробки помилок у реактивному потоці.

    Якщо під час виконання потоку виникає помилка (у даному випадку —
    RuntimeException), викликається функція, передана в onErrorResume

 */

public class Example4 {

//    public static void main(String[] args) {
//        Mono<String> monoWithError = Mono.error
//                (new RuntimeException("Something went wrong"));
//
//        monoWithError.onErrorResume(e -> {
//            System.out.println("Error occurred: " + e.getMessage());
//            return Mono.just("Fallback value");
//        }).subscribe(System.out::println);
//    }

    public static void main(String[] args) {

        Mono<String> monoWithErr = Mono.error(new RuntimeException("This is RuntimeException"));

        monoWithErr.onErrorResume(
                e->{
                    System.out.println("Err"+e.getMessage());
                    return Mono.just("No err");
                }).subscribe(System.out::println);
    }



}
