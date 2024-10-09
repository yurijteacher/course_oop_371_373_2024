package ua.com.kisit_course.example.example3.components;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users;

    UserService() {
        users = new ArrayList<>(){
            {
                add (new User(1, "Ivan", "Pypkin",21));
                add (new User(2, "Iva", "Pypkinf",22));
                add (new User(3, "Ivanka", "Pypkinf",22));
            }
        };
    }

    Flux<User> getAll() {
        return Flux.fromIterable(users);
    }



}
