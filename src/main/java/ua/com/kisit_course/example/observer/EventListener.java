package ua.com.kisit_course.example.observer;

import java.io.File;

//  Інтерфейс передплатників
public interface EventListener {

    //
    void update(String eventType, File file);

}
