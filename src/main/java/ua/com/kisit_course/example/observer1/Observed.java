package ua.com.kisit_course.example.observer1;

// інтерфейс підписника
public interface Observed {

    // Додавання підписника (спостерігача)
    public void addObserver(Observer observer);

    // Видалення підписника (спостерігача)
    public void removeObserver(Observer observer);

    // повідомлення підписникам
    public void notifyObservers();
}
