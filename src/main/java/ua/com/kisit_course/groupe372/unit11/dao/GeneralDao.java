package ua.com.kisit_course.groupe372.unit11.dao;

import java.util.List;

public interface GeneralDao<T> {

    List<T> getAll();
    T getById(long id);
    T save(T t);
    void delete(T t);
    void deleteById(long id);
    void update(T t);


}
