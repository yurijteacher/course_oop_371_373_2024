package ua.com.kisit_course.groupe372.unit11;

import ua.com.kisit_course.groupe372.unit11.entity.Address;
import ua.com.kisit_course.groupe372.unit11.entity.Category;
import ua.com.kisit_course.groupe372.unit11.entity.Product;
import ua.com.kisit_course.groupe372.unit11.repository.AddressRepository;
import ua.com.kisit_course.groupe372.unit11.repository.CategoryRepository;
import ua.com.kisit_course.groupe372.unit11.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        new MyConnection().myConnection();

        Category category = new Category();
        category.setName("iPhone");
        category.setDescription("asd sad sa d");
        category.setImages("/static/1.jpg");

        CategoryRepository categoryRepository =  new CategoryRepository();
//        categoryRepository.save(category);

        Category category1 = categoryRepository.getById(1L);
        category1.setName("Mac book Pro");

        categoryRepository.update(category1);

        categoryRepository.deleteById(1L);

        List<Category> categoryList = new ArrayList<>();
        categoryList = categoryRepository.getAll();

        for (Category category11: categoryList) {
            System.out.println(category11);
        }
        
        Category category2 = categoryRepository.getById(2L);


        Product product = new Product();
        product.setName("iPhone");
        product.setDescription("asd sad sa d");
        product.setPrice(15000);
        product.setCategory(category2);
        product.setImage("/static/1.jpg");

        ProductRepository productRepository = new ProductRepository();
//        productRepository.save(product);
        
        List<Product> productList = productRepository.getAll();

        for (Product product2: productList) {
            System.out.println(product2);
        }

        Product product1 = productRepository.getById(7L);
        product1.setName("iPhone 12");
        productRepository.update(product1);


        Product product2 = productRepository.getById(7L);


        System.out.println(product2);
        
        

        Address address = new Address();

        address.setDescription("ASd  sad  sad");

        AddressRepository addressRepository = new AddressRepository();

//        addressRepository.save(address);

        List<Address> addressList = addressRepository.getAll();

        for (Address address2: addressList) {
            System.out.println(address2);
        }



    }
}
