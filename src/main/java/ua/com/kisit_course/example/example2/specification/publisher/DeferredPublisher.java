package ua.com.kisit_course.example.example2.specification.publisher;

import lombok.RequiredArgsConstructor;
import ua.com.kisit_course.example.example2.specification.Publisher;
import ua.com.kisit_course.example.example2.specification.Subscriber;

import java.util.function.Supplier;

@RequiredArgsConstructor
public class DeferredPublisher<T> implements Publisher<T> {

    private final Supplier<Publisher<T>> supplier;

    @Override
    public void subscribe(Subscriber<? super T> subscriber) {
        supplier.get().subscribe(subscriber);
    }
}
