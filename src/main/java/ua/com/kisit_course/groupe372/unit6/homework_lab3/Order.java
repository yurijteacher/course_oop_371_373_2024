package ua.com.kisit_course.groupe372.unit6.homework_lab3;

import java.util.Date;
import java.util.List;

public class Order {

    private Long id;
    private Date dateCreated;
    private String payment;
    private String delivery;

    private Customer customer;

    private List<ProductHasOrder> productHasOrders;

    public List<ProductHasOrder> getProductHasOrders() {
        return productHasOrders;
    }

    public void setProductHasOrders(List<ProductHasOrder> productHasOrders) {
        this.productHasOrders = productHasOrders;
    }

    public Order() {
    }

    public Order(Long id, Date dateCreated, String payment, String delivery, Customer customer) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.payment = payment;
        this.delivery = delivery;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", payment='" + payment + '\'' +
                ", delivery='" + delivery + '\'' +
                ", customer=" + customer +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
