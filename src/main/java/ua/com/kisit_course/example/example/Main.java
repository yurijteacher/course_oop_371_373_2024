package ua.com.kisit_course.example.example;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;


public class Main {

    static class MySubscriber implements Observer<String> {
        @Override
        public void onSubscribe(Disposable d) {
            // Можна реалізувати логіку при підписці
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

    public static void main(String[] args) {


        Observable<String> reactiveObservable =
                Observable
                        .create(new ObservableOnSubscribe<String>() {
                                    @Override
                                    public void subscribe(@NonNull ObservableEmitter<String> emitter)
                                            throws Throwable {
                                        emitter.onNext("I am reactive!");
                                        emitter.onComplete();
                                    }
                                }
                        );





        reactiveObservable
                .subscribe(
                        item -> System.out.println("Received on: " + Thread.currentThread().getName() + " " + item),
                        error -> System.err.println("Error: " + error),
                       () -> System.out.println("Completed on: " + Thread.currentThread().getName())
                       // new MySubscriber()
//                        new Subscriber()
                );


        try {
            Thread.sleep(2000); // Дати потокам завершити роботу
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Observable.just("I am reactive!").subscribe(System.out::println);


    }
}
