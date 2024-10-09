package ua.com.kisit_course.example.example2.specification.subscriber;

import lombok.RequiredArgsConstructor;
import ua.com.kisit_course.example.example2.specification.Subscriber;
import ua.com.kisit_course.example.example2.specification.Subscription;

import java.util.function.Consumer;

@RequiredArgsConstructor
public class ConsumingSubscriber<T> implements Subscriber<T> {

    private final Consumer<T> consumer;
    private Subscription subscription;

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(Integer.MAX_VALUE);
    }

    @Override
    public void onNext(T value) {
        consumer.accept(value);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
