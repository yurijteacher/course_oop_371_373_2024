package ua.com.kisit_course.example.test_project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;

public class SyncHTTPClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReactiveHttpClient.class);

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newHttpClient();

        System.out.println(new Date());
        for (int i = 0; i < 25; i++) {
            long startTime = System.nanoTime();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://www.olx.ua/uk/list/q-nikon/?page="+i))
                    .build();

            HttpResponse<String> send = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            LOGGER.info("{}",i);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println(duration);
            System.out.println(i+", startTime: " + startTime + ", endTime: " + endTime + ", час виконання: " + ((double)duration/1000000000) + " секунд");
        }
        System.out.println(new Date());




    }


}
