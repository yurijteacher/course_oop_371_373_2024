package ua.com.kisit_course.example.example;

import io.reactivex.rxjava3.core.*;

public class Subscriber implements Observer<String> {

    @Override
    public void onSubscribe(io.reactivex.rxjava3.disposables.Disposable d) {
        // Можливо виконати додаткові дії при підписці
    }
    @Override
    public void onNext(String item) {
        System.out.println("Received on: " + Thread.currentThread().getName() + " " + item);
    }

    @Override
    public void onError(Throwable error) {
        System.err.println("Error: " + error);
    }

    @Override
    public void onComplete() {
        System.out.println("Completed on: " + Thread.currentThread().getName());
    }

}
