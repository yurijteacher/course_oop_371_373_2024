package ua.com.kisit_course.example.example2.specification;

import ua.com.kisit_course.example.example2.specification.publisher.DeferredPublisher;
import ua.com.kisit_course.example.example2.specification.publisher.JustPublisher;
import ua.com.kisit_course.example.example2.specification.publisher.MapPublisher;
import ua.com.kisit_course.example.example2.specification.publisher.ParallelPublisher;
import ua.com.kisit_course.example.example2.specification.subscriber.CollectingSubscriber;
import ua.com.kisit_course.example.example2.specification.subscriber.ConsumingSubscriber;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public interface Publisher<T> {

    @SafeVarargs
    static <V> Publisher<V> just(V... values) {
        return new JustPublisher<>(values);
    }

    void subscribe(Subscriber<? super T> subscriber);

    static <V> Publisher<V> defer (Supplier<Publisher<V>> supplier) {
        return new DeferredPublisher<>(supplier);
    }

    static <V> Publisher<V> from (Supplier<V> supplier) {
        return new DeferredPublisher<>(()->Publisher.just(supplier.get()));
    }

    default <R> Publisher<R> map(Function<T, R> mapper) {
        return new MapPublisher<>(this, mapper);
    }

    default Publisher<T> peek(Consumer<T> consumer) {

        return new MapPublisher<>(this, value ->{
            consumer.accept(value);
            return value;
        });
    }

    default Publisher<T> parallel(int parallelism) {
        return new ParallelPublisher<>(this, parallelism);
    }

    default List<T> collect(){
        CollectingSubscriber<T> subscriber = new CollectingSubscriber<>();
        subscribe(subscriber);
        return subscriber.blockingGet();
    }

    default void consume(Consumer<T> consumer){
        ConsumingSubscriber<T> sub = new ConsumingSubscriber<>(consumer);
        subscribe(sub);
    }



}
