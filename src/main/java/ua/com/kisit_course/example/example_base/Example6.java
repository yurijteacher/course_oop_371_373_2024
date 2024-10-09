package ua.com.kisit_course.example.example_base;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

/*
    6. Виконання в іншому потоці
    Reactor дозволяє легко перемикати виконання на інший потік
    за допомогою publishOn та subscribeOn
 */


public class Example6 {

//    public static void main(String[] args) throws InterruptedException {
//        Flux<Integer> numbers = Flux.range(1, 100);
//
//        numbers.publishOn(Schedulers.parallel())  // Виконання в іншому потоці
//                .subscribe(num -> {
//                    System.out.println("Received: " + num + " on thread: "
//                            + Thread.currentThread().getName());
//                });
//
//        // Додаємо затримку, щоб дочекатися завершення асинхронної обробки
//        Thread.sleep(2000);
//    }

    public static void main(String[] args) throws InterruptedException {

        Flux<Integer> numbers = Flux.range(1, 100);

        numbers.publishOn(Schedulers.parallel()).subscribe(
                num -> {
                    System.out.println("Number:" + num +
                            ", on Thead:"
                            + Thread.currentThread().getName());
                });

        Thread.sleep(1000);
    }


}
