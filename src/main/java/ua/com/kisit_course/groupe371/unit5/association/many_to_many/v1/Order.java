package ua.com.kisit_course.groupe371.unit5.association.many_to_many.v1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Long id;
    private String user;
    private Date dateCreated;

    private List<Product> productList = new ArrayList<>();

    public Order() {
    }

    public Order(Long id, String user, Date dateCreated, List<Product> productList) {
        this.id = id;
        this.user = user;
        this.dateCreated = dateCreated;
        this.productList = productList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", dateCreated=" + dateCreated +
                ", productList=" + productList +
                '}';
    }


    // get/set
    // const
}
