package ua.com.kisit_course.example.observer1;

import java.util.ArrayList;
import java.util.List;

// Cайт на якому є список вакансій
public class JavaDeveloperJobSite implements Observed {

    // Містить список ваканцій
    List<String> vacancies = new ArrayList<>();

    // Список підписників
    List<Observer> subscribers = new ArrayList<>();

    // Додавання нових вакансій
    // Додавання повідомлень всіх підписників
    public void addVacancy (String vacancy) {
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy (String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    // Додаємо підписника
    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    // видаляємо підписника
    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    // Перебираємо список підписників і повідомляємо їх про наявні вакансії
    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.vacancies);
        }
    }
}
