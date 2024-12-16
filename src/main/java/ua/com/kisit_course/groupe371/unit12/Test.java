package ua.com.kisit_course.groupe371.unit12;

import ua.com.kisit_course.groupe371.unit12.entity.Category;
import ua.com.kisit_course.groupe371.unit12.repository.CategoryRepository;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        CategoryRepository categoryRepository = new CategoryRepository();

        categoryRepository.save(new Category("iPadas13", "qassdwq sad asd as", "/static/2.jps"));

        List<Category> categories = categoryRepository.findAll();

        for (Category category : categories) {
            System.out.println(category.toString());
        }


    }


}
