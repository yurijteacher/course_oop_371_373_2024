package ua.com.kisit_course.groupe372.unit12;

import java.util.List;

public interface CategoryDao {

    void save(Category category);
    void update(Category category);
    void delete(Long id);
    Category getById(long id);
    List<Category> findAll();
    void deleteAll();

}
