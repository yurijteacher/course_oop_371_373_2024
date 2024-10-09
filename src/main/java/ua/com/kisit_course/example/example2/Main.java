package ua.com.kisit_course.example.example2;

import lombok.extern.slf4j.Slf4j;
import ua.com.kisit_course.example.example2.specification.Publisher;

@Slf4j
public class Main {

    /*
    Основні поняття концепції реактивного програмування

    Publisher (observable) - джерело даних (видавець).
    Subscriber (observer) - підписник, який очікує дані від Publisher.
    Subscription - це підписка, за допомогою якої можна повідомити видавця (Publisher), що Subscriber готовий прийняти дані.
     */


    public static void main(String[] args) {
//        var result =
        //Publisher
        //.just(1, 2, 3)
//                Publisher.defer(()->Publisher.just(1,2,3))
//                .peek(System.out::println)
//                .map(i -> i * 2)
//                .peek(System.out::println)
//                .collect();
//
//        System.out.println(result);

//  var result = Publisher.from(()->{
//      System.out.println("Very long operation");
//      return 1;
//  }).
//                 peek(System.out::println)
//                .map(i -> i * 2)
//                .peek(System.out::println);
//
//        System.out.println("I was called earlier!");
//        System.out.println(result.collect());

//        Publisher
//                .just(1, 2, 3)
//                .map(i -> i * 2)
//                .consume(System.out::println);
//
//        var result1 = Publisher
//                .just(1, 2, 3)
//                .peek(System.out::println)
//                .map(i -> i * 2)
//                .peek(System.out::println)
//                .collect();
//
//        System.out.println(result1);

        Publisher.just(1, 2, 3).parallel(3).map(
                        i -> {
                            try {
                                Thread.sleep(5000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            return i * 4;
                        }
                ).
                //consume(System.out::println);
        consume(i -> log.info("{}", i));
    }
}
