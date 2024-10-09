package ua.com.kisit_course.example.observer1;

import java.util.List;

// інтерфейс підписника, який очікуєдані від publisher'a.
public interface Observer {

    // Обробка подій (приймає список вакансій)
    public void handleEvent(List<String> vacancies);


}
