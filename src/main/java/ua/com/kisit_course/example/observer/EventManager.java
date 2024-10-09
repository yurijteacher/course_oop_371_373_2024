package ua.com.kisit_course.example.observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// Базовий видавець
// об'єкт класу EventManager, який керує підписниками (спостерігачами) і дозволяє
// підписуватися на події, як-от "open" (відкриття) та "save" (збереження файлу).

public class EventManager {

    // Map<String, List<EventListener>> listeners — це колекція, де кожен ключ (тип події)
    // відповідає списку підписників (об'єктів, які імплементують інтерфейс EventListener).
    Map<String, List<EventListener>> listeners = new HashMap<>();

    // Конструктор EventManager(String... operations):
    // Приймає список подій (як-от "open" чи "save").
    // Для кожної події ініціалізується порожній список підписників у колекції listeners.
    public EventManager(String... operations) {   // new EventManager("open", "save");
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    /*
    Метод subscribe(String eventType, EventListener listener):
    Додає підписника (спостерігача) до списку для відповідного типу події.
    Якщо, наприклад, подія — це "open", цей метод додає нового слухача до списку слухачів для події "open".
     */
    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    /*
    Метод unsubscribe(String eventType, EventListener listener):
    Видаляє підписника із списку слухачів для конкретної події.
    Наприклад, якщо підписник більше не хоче бути повідомленим про події типу "open",
     цей метод видалить його зі списку.
     */
    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    /*
    Метод notify(String eventType, File file):
    Сповіщає всіх підписників про те, що відбулася подія певного типу.
    Для кожного підписника в списку викликається метод update(), який інформує
    його про настання події та передає файл як параметр.
     */
    public void notify(String eventType, File file) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, file);
        }
    }


}
