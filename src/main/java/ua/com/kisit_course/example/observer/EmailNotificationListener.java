package ua.com.kisit_course.example.observer;

import java.io.File;

// Клас EmailNotificationListener є конкретним спостерігачем (слухачем), що реалізує інтерфейс EventListener.
// Його завдання — надсилати повідомлення електронною поштою, коли відбувається певна подія, наприклад,
// відкриття або збереження файлу.

public class EmailNotificationListener implements EventListener {

    private String email;

    // Приймає електронну адресу користувача, на яку будуть надсилатися повідомлення про події.
    // Ініціалізує поле email значенням, яке було передане при створенні екземпляра класу.
    public EmailNotificationListener(String email) {
        this.email = email;
    }

    // Це перевизначений метод із інтерфейсу EventListener.
    // Викликається щоразу, коли відбувається подія (наприклад, відкриття або збереження файлу).
    // Метод виводить повідомлення у консоль, яке імітує відправку електронного листа

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }

}
