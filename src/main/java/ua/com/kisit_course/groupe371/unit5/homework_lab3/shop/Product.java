package ua.com.kisit_course.groupe371.unit5.homework_lab3.shop;

import java.util.List;

public class Product {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private Category category;

    private List<ProductHasOrder> productHasOrderLists;

    public List<ProductHasOrder> getProductHasOrderLists() {
        return productHasOrderLists;
    }

    public void setProductHasOrderLists(List<ProductHasOrder> productHasOrderLists) {
        this.productHasOrderLists = productHasOrderLists;
    }

    public Product() {
    }

    public Product(Long id, String name, String description, Double price, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
