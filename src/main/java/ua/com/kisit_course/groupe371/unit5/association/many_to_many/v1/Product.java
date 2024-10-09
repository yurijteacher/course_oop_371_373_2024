package ua.com.kisit_course.groupe371.unit5.association.many_to_many.v1;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private Long id;
    private String name;
    private String description;
    private double price;

    private List<Order> orderList = new ArrayList<>();

    public Product() {
    }

    public Product(Long id, String name, String description, double price, List<Order> orderList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.orderList = orderList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", orderList=" + orderList +
                '}';
    }

    // get/set
    // const
}
