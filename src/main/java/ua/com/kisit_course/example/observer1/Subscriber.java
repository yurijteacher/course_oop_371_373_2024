package ua.com.kisit_course.example.observer1;

// Клас підписника
import java.util.List;

// Реалізація підписника
public class Subscriber implements Observer{

    // назва підписника
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    // Виводимо список ваканцій!!!
    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println(
                "Dear, " + name +"! " + "\n We have some changes in vacancies" + vacancies +
                "\n========================="
        );
    }
}
