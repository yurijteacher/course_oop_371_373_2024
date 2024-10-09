package ua.com.kisit_course.groupe371.unit5.homework_lab3.shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Category phone = new Category();
        phone.setName("phone");
        phone.setId(1L);
        phone.setDescription("phone description");

        Category display = new Category();
        display.setName("display");
        display.setId(2L);
        display.setDescription("display description");

        Category network = new Category();
        network.setName("network");
        network.setId(3L);
        network.setDescription("network description");

        Product iPhone16 = new Product(1L, "iPhone16","asd  asd as d sa d",22000.00,phone);
        Product iPhone16Pro = new Product(2L, "iPhone16Pro","aswd  asd as d sa d",62000.00,phone);


        List<Product> products = new ArrayList<>();
        products.add(iPhone16);
        products.add(iPhone16Pro);

        phone.setProducts(products);

        System.out.println(phone);


        System.out.println(iPhone16);

        System.out.println(iPhone16Pro);

        Client client = new Client();
        client.setId(1L);
        client.setFirstname("Vasya");
        client.setLastname("Pypkin");
        client.setPhone("123");
        client.setEmail("vasya@gmail.com");
        System.out.println(client);

        Order order = new Order();
        order.setId(1L);
        order.setClient(client);
        order.setDateCreated(new Date(2023,3,23));
        order.setDelivery("delivery");
        order.setPayment("payment");

        System.out.println(order);


        ProductHasOrder productHasOrder = new ProductHasOrder();
        productHasOrder.setOrder(order);
        productHasOrder.setProduct(iPhone16);
        productHasOrder.setQuantity((short) 1);

        ProductHasOrder productHasOrder1 = new ProductHasOrder();
        productHasOrder1.setOrder(order);
        productHasOrder1.setProduct(iPhone16Pro);
        productHasOrder1.setQuantity((short) 3);

        List<ProductHasOrder> productHasOrders = new ArrayList<>();
        productHasOrders.add(productHasOrder);
        productHasOrders.add(productHasOrder1);

        System.out.println(productHasOrders);

    }

}
