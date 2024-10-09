package ua.com.kisit_course.example.example_base;

import reactor.core.publisher.Flux;
import java.time.Duration;

/*
    5. Затримки і час у потоках
    Можна використовувати delayElements, щоб додати затримки між елементами.
*/
public class Example5 {

//    public static void main(String[] args) throws InterruptedException {
//        Flux<Integer> numbers = Flux.range(1, 5);
//
//        numbers.delayElements(Duration.ofSeconds(1))  // Додаємо затримку в 1 секунду
//                .subscribe(System.out::println);
//
//        // Затримка основного потоку, щоб дочекатися завершення асинхронної обробки
//        Thread.sleep(6000);
//    }


    public static void main(String[] args) throws InterruptedException {

        Flux<Integer> integerFlux = Flux.range(1,10);

        integerFlux.
         delayElements(Duration.ofMillis(400))
                .subscribe(System.out::println);

         Thread.sleep(5000);

    }
}
