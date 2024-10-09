package ua.com.kisit_course.example.projectreactor;

import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Mono.empty();
        Flux.empty();

        Flux<Integer> integerFlux = Flux.just(1, 2, 3);
        Mono<Integer> integerMono = Mono.just(3);

        Mono<Integer> integerMono2 = integerFlux.elementAt(1);
        Flux<Integer> integerFlux1 = integerMono.flux();

        Flux.range(1, 5)
                .subscribe(System.out::println);

        System.out.println("sout:");
        Flux.fromIterable(Arrays.asList(1, 2, 3, 4, 5))
                .subscribe(System.out::println);

        Flux<String> stringFlux = Flux.just("a", "b", "c");

        Flux.<String>generate(el -> el
                .next("Hello!"))
                .take(10).subscribe(System.out::println);


         stringFlux.subscribe(System.out::println);

        Flux.<String>generate(sink -> {
                    sink.next("Hello World!");
                })
                .delayElements(Duration.ofMillis(500))
                .take(4)
                .subscribe(System.out::println);

//        Thread.sleep(3000);

        Flux.generate(
                () -> 2354,
                (state, sink) -> {
                    if (state > 2366) {
                        sink.complete();
                    } else {
                        sink.next("Hello World!!!");
                    }
                    return state + 3;
                }
        ).subscribe(System.out::println);


        Flux<Object> telegramProducer = Flux.generate(() -> 2350,
                (state, sink) -> {
                    if (state > 2360) {
                        sink.complete();
                    } else {
                        sink.next("Step" + state);
                    }
                    return state + 3;
                }
        );

        Flux
                .create(sink -> {
                    telegramProducer
                            .subscribe(new BaseSubscriber<Object>() {
                        @Override
                        protected void hookOnNext(Object value) {
                            sink.next(value);
                        }
                        @Override
                        protected void hookOnComplete() {
                            sink.complete();
                        }
                    });
                    sink.onRequest(r -> {
                        sink.next("DB ..." + telegramProducer.blockFirst());
                    });
                })
                .subscribe(System.out::println);
        Thread.sleep(4000);

        Flux<String> second = Flux
                .just("Hello", "World")
                .repeat();

        Flux<String> sumFlux = Flux
                .just("First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth")
                .zipWith(second, (f, s) -> String.format("%s %s", f, s));

        sumFlux.subscribe(System.out::println);

//        sumFlux.
//                delayElements(Duration.ofMillis(1300))
//                .timeout(Duration.ofMillis(1))
//                .onErrorReturn("Too show")
//                .subscribe(System.out::println);


    List<String> fruits = Stream
                .of("apple", "orange","banana")
                .filter(e->e.equals("apple") || e.equals("orange"))
                .map(e->e + " fruits").toList();

    List<String> fruits1 = fruits
                         .parallelStream()
                         .map(e->e + "!!").toList();

    fruits1.stream().parallel().forEach(System.out::println);




    }
}
