package ua.com.kisit_course.example.observer;

import java.io.File;


 /* LogOpenListener є конкретним спостерігачем (слухачем), що реалізує інтерфейс EventListener.
    Його завдання — записувати інформацію про операції, виконані над файлом, у лог (журнал).
  */

public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
