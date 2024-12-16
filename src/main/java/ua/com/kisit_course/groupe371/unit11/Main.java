package ua.com.kisit_course.groupe371.unit11;

import ua.com.kisit_course.groupe371.unit11.config.MyConnection;
import ua.com.kisit_course.groupe371.unit11.entity.Category;
import ua.com.kisit_course.groupe371.unit11.entity.Product;
import ua.com.kisit_course.groupe371.unit11.repository.AddressRepository;
import ua.com.kisit_course.groupe371.unit11.repository.CategoryRepository;
import ua.com.kisit_course.groupe371.unit11.repository.ProductRepository;
import ua.com.kisit_course.groupe372.unit11.entity.Address;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        new MyConnection().getConnection();

        Category category = new Category();
        category.setName("Phone");
        category.setDescription("Phone description");
        category.setImage("/images/2.jpg");

        CategoryRepository categoryRepository = new CategoryRepository();
//        categoryRepository.save(category);

        List<Category> categoryList = categoryRepository.getAll();

        for (Category el : categoryList) {
            System.out.println(el);
        }


        Category category1 = categoryRepository.getById(2L);


        Product product = new Product();
        product.setCategory(category1);
        product.setDescription("Product description");
        product.setName("iPhone 11");
        product.setPrice(20000.00);

        ProductRepository productRepository = new ProductRepository();

        productRepository.save(product);

        List<Product> products = productRepository.getAll();

        for (Product el: products){
            System.out.println(el);
        }

        Product product1 = productRepository.getById(3);

        System.out.println(product1);

        product1.setName("iPhone 12");

//        productRepository.update(product1);

        List<Product> products1 = productRepository.getAll();

        for (Product el: products1){
            System.out.println(el);
        }

//        productRepository.delete(product1);

        System.out.println("--");
        List<Product> products2 = productRepository.getAll();
        for (Product el: products2){
            System.out.println(el);
        }


        Address address = new Address();
        address.setDescription("Asdsf dsf dsfdsf ");

        AddressRepository addressRepository = new AddressRepository();
        addressRepository.save(address);

        List<Address> addresses = addressRepository.getAll();

        for (Address el: addresses){
            System.out.println(el);
        }

    }

}
