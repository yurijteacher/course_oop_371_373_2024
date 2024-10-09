package ua.com.kisit_course.example.example2.specification.publisher;

import lombok.RequiredArgsConstructor;
import ua.com.kisit_course.example.example2.specification.Publisher;
import ua.com.kisit_course.example.example2.specification.Subscriber;
import ua.com.kisit_course.example.example2.specification.Subscription;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ParallelPublisher<T> implements Publisher<T> {

    private final Publisher<T> upstream;
    private final ThreadPoolExecutor executor;

    public ParallelPublisher(Publisher<T> upstream, int parallelism) {
        this.upstream = upstream;
        executor = new ThreadPoolExecutor(parallelism, parallelism, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
    }


    @Override
    public void subscribe(Subscriber<? super T> subscriber) {
        upstream.subscribe(new ParallelSubscriber(subscriber));
    }

    @RequiredArgsConstructor
    private class ParallelSubscriber implements Subscriber<T> {

        private final Subscriber<? super T> subscriber;

        @Override
        public void onSubscribe(Subscription subscription) {
            subscriber.onSubscribe(subscription);
        }

        @Override
        public void onNext(T value) {
            executor.submit(()->subscriber.onNext(value));
        }

        @Override
        public void onError(Throwable throwable) {

        }

        @Override
        public void onComplete() {
            subscriber.onComplete();
            executor.shutdown();
        }
    }
}
