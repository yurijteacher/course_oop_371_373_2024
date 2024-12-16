package ua.com.kisit_course.groupe371.unit12.repository;

import ua.com.kisit_course.groupe371.unit12.entity.Category;

import java.util.List;

public interface CategoryDao {

    void save(Category category);
    void update(Category category);
    void delete(Category category);
    List<Category> findAll();
    Category findById(long id);
    void deleteAll();

}
