package ua.com.kisit_course.example.example2.specification;

public interface Subscriber<T> {

    void onSubscribe(Subscription subscription); // який повинен приймати Subscription
    void onNext(T value);
    void onError(Throwable throwable);
    void onComplete();

}
