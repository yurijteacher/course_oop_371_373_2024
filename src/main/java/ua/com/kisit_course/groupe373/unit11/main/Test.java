package ua.com.kisit_course.groupe373.unit11.main;

import ua.com.kisit_course.groupe373.unit11.config.MyConnection;
import ua.com.kisit_course.groupe373.unit11.entity.Categories;
import ua.com.kisit_course.groupe373.unit11.entity.Clients;
import ua.com.kisit_course.groupe373.unit11.entity.Products;
import ua.com.kisit_course.groupe373.unit11.repository.CategoryRepository;
import ua.com.kisit_course.groupe373.unit11.repository.ClientsRepository;
import ua.com.kisit_course.groupe373.unit11.repository.ProductRepository;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        new MyConnection().getConnection();

        CategoryRepository categoryRepository = new CategoryRepository();
//        categoryRepository.save(new Categories("MacBook", "asd sad sad", "/static/1.jpg"));

        Categories categories = new Categories();
        categories.setName("iPods");
        categories.setDescription("sad sad sa d");
        categories.setImage("3.jpg");


        Categories category = categoryRepository.getById(3);
        category.setName("Apple Mac Book Pro");

        categoryRepository.update(category);
//        categoryRepository.delete(category);

        List<Categories> categoriesList = categoryRepository.getAll();
        for (Categories c : categoriesList) {
            System.out.println(c);
        }


        Categories category1 = categoryRepository.getById(1L);


        Products products = new Products();

        products.setName("iPhone 10");
        products.setDescription("iPhone 10 description");
        products.setImage("i_phone10.jpg");
        products.setPrice(20000);
        products.setCategory(category1);
        products.setQuantity(100);

        ProductRepository repository = new ProductRepository();
//        repository.save(products);

        List<Products> productsList = repository.getAll();
        for (Products p : productsList) {
            System.out.println(p);
        }

        Clients client = new Clients();

        client.setUsername("Vasya");
        client.setPassword("1234");

        ClientsRepository clientsRepository = new ClientsRepository();
//        clientsRepository.save(client);

        List<Clients> clients = clientsRepository.getAll();

        for (Clients c : clients) {
            System.out.println(c);
        }

        client.setId(2);
        client.setUsername("Pypkin");

        clientsRepository.update(client);

        List<Clients> clients1 = clientsRepository.getAll();
        for (Clients c : clients1) {
            System.out.println(c);
        }

        client.setId(3);

        clientsRepository.delete(client);

        List<Clients> clients2 = clientsRepository.getAll();
        for (Clients c : clients2) {
            System.out.println("//");
            System.out.println(c);
        }








    }

}
