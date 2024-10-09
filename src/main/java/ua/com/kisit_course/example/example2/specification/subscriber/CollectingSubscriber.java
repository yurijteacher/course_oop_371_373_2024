package ua.com.kisit_course.example.example2.specification.subscriber;

import ua.com.kisit_course.example.example2.specification.Subscriber;
import ua.com.kisit_course.example.example2.specification.Subscription;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CollectingSubscriber <T> implements Subscriber<T> {

    private Subscription subscription;
    private final List<T> result = new ArrayList<>();
    private boolean completed = false;

    @Override
    public void onSubscribe(Subscription subscription) {
        if(this.subscription != null)
            throw  new RuntimeException("Subscription already subscribed");
        this.subscription= subscription;
    }

    @Override
    public void onNext(T value) {
        result.add(value);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {
        this.completed = true;  // Дані закінчились
    }

    public List<T> blockingGet(){
        Objects.requireNonNull(subscription, "No subscription");
        subscription.request(Integer.MAX_VALUE);
        // Очікування
        while (!completed) {
            Thread.onSpinWait(); // Поток не може далі ...
        }
        return result;
    }
}
