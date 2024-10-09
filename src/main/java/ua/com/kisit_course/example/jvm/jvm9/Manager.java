package ua.com.kisit_course.example.jvm.jvm9;

public interface Manager {

    void manage(String param1, int param2, Object param3);

    default void manage(){
        manage("", 10, new Object());
    }




}
