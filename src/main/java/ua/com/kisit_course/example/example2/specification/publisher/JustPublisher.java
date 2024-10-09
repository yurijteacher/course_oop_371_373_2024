package ua.com.kisit_course.example.example2.specification.publisher;

import lombok.RequiredArgsConstructor;
import ua.com.kisit_course.example.example2.specification.Publisher;
import ua.com.kisit_course.example.example2.specification.Subscriber;
import ua.com.kisit_course.example.example2.specification.Subscription;

//@AllArgsConstructor
public class JustPublisher<T> implements Publisher<T> {

    private final T[] values;

    public JustPublisher(T[] values) {
        this.values = values;
    }

    @Override
    public void subscribe(Subscriber<? super T> subscriber) {
        Subscription subscription = new JustSubscrition(subscriber); //Cтворюємо підписку
        subscriber.onSubscribe(subscription); // передаємо підписнику його підписку
    }

    @RequiredArgsConstructor
    private class JustSubscrition implements Subscription {

        private final Subscriber<? super T> subscriber;
        private int position = 0;

        @Override
        public void request(int n) {
            for (int i = 0; i < n; i++) {
                if(position == values.length){
                    subscriber.onComplete();
                    return;
                }
                subscriber.onNext(values[position++]);
            }
        }
    }

}
