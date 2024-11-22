package ua.com.kisit_course.groupe371.unit11.repository;

import java.util.List;

public interface GeneralDao<T> {

    void save(T t);
    void update(T t);
    void delete(T t);
    List<T> getAll();
    T getById(long id);

}
