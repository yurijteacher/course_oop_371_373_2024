package ua.com.kisit_course.groupe372.unit12;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        MyConnection connection = new MyConnection();
//        connection.getConnection();

        CategoryRepository categoryRepository = new CategoryRepository();
        categoryRepository.save(new Category("iPhone11","asd sad asd","/static/as.jpg"));


        List<Category> categoryList = categoryRepository.findAll();

        for (Category category : categoryList) {
            System.out.println(category);
        }


    }

}
