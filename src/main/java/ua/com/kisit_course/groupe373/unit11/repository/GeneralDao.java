package ua.com.kisit_course.groupe373.unit11.repository;

import java.util.List;

public interface GeneralDao <T>{

    List<T> getAll();
    T getById(long id);
    void save(T t);
    void delete(T t);
    void update(T t);


}
