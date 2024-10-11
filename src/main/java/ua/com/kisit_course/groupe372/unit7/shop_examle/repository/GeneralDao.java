package ua.com.kisit_course.groupe372.unit7.shop_examle.repository;

import java.util.List;

public interface GeneralDao<T> {

    void save(T t);
    void update(T t);
    void delete(T t);
    T findById(Long id);
    List<T> findAll();
}
