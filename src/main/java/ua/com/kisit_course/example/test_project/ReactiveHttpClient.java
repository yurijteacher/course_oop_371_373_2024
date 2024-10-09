package ua.com.kisit_course.example.test_project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactiveHttpClient {

    private static final String PREFIX_URL = "https://www.olx.ua/uk/list/q-nikon/?page=";
    private static final Logger LOGGER = LoggerFactory.getLogger(ReactiveHttpClient.class);
    private static WebClient client = WebClient.builder()
            .codecs(configurer -> configurer
            .defaultCodecs() // Збільшення буферу до 16МБ
            .maxInMemorySize(16 * 1024 * 1024))
            .build();


    public static void main(String[] args) {

//        Scheduler singleThreadScheduler = Schedulers.newSingle("single-thread");

//        System.setProperty("reactor.netty.ioWorkerCount", "1");

        Flux.range(0, 24)
                .map(i->PREFIX_URL+i)
//                .log()
                .doOnNext(c -> LOGGER.info("{}", c))
                // після того, як сторінка скачана
                .flatMap(page -> sendRequest(page),24)
                // вивід повідомлення
                .doOnNext(p->LOGGER.info("page download",p))
//                .subscribeOn(singleThreadScheduler)
//                .subscribeOn(Schedulers.boundedElastic())
//                .subscribe();


                .blockLast();

        LOGGER.info("finish"); // відновлення послідовності
    }

    private static Mono<String> sendRequest(String text) {
        return client.
                get()
                .uri(text)
                // Завантажуємо сторінку
                .retrieve()
                // перетворюємо у рядок
                .bodyToMono(String.class); //.log();
    }
}