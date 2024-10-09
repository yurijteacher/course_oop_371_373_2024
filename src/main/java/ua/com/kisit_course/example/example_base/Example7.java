package ua.com.kisit_course.example.example_base;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class Example7 {

    public static void main(String[] args) throws InterruptedException {
        Flux<Integer> numbers = Flux.range(1, 5)
                .map(i -> {
                    System.out.println("First map on thread: " +
                            Thread.currentThread().getName());
                    return i * 2;
                });

        // Перемикаємо потік виконання після першого map
        numbers.publishOn(Schedulers.boundedElastic())
                .map(i -> {
                    System.out.println("Second map on thread: " +
                            Thread.currentThread().getName());
                    return i + 1;
                })
                .subscribe(i -> System.out.println("Received: " + i + " on thread: " +
                        Thread.currentThread().getName()));

        // Затримка основного потоку, щоб дочекатися завершення асинхронної обробки
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

    /*
    Метод publishOn у Reactor використовується для перемикання потоку виконання
    (тобто зміни потоку, в якому виконуються операції) на інший Scheduler після того,
    як було опубліковано (створено) події. Він впливає на всі подальші оператори
    після свого виклику, перемикаючи їх на зазначений потік виконання.

    Основні моменти про publishOn:
    Перемикає потік виконання після точки, де викликається.
    Не впливає на оператори, що були виконані до його виклику.
    Використовується для того, щоб обробляти реактивний потік на іншому потоці
    (наприклад, для розпаралелювання обчислень або виконання роботи в бекграунд-потоці).

    Пояснення:
    Перший map виконується в основному потоці (де була викликана програма).
    Після виклику publishOn(Schedulers.boundedElastic()) потік виконання перемикається на інший,
    і наступний map (та всі інші операції) виконується в потоці, наданому Schedulers.boundedElastic().

    Основна відмінність від subscribeOn:
    publishOn впливає тільки на оператори, які йдуть після нього в реактивному ланцюжку.
    subscribeOn впливає на весь ланцюжок реактивного потоку, перемикаючи потік виконання
    з самого початку (включно з усіма попередніми операторами).

    Для чого використовується publishOn:
    Для обробки частини реактивного потоку на іншому потоці, щоб не блокувати основний або
    не перевантажувати конкретний потік.
    Для розпаралелювання роботи, якщо потрібно виконувати різні етапи реактивного ланцюжка
    на різних потоках.
     */


