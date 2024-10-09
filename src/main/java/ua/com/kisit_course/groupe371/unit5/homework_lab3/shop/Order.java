package ua.com.kisit_course.groupe371.unit5.homework_lab3.shop;

import java.util.Date;
import java.util.List;

public class Order {

    private Long id;
    private Date dateCreated;
    private String payment;
    private String delivery;
    private double total;

    private List<ProductHasOrder> productHasOrderList;

    public List<ProductHasOrder> getProductHasOrderList() {
        return productHasOrderList;
    }

    public void setProductHasOrderList(List<ProductHasOrder> productHasOrderList) {
        this.productHasOrderList = productHasOrderList;
    }

    private Client client;

    public Order() {
    }

    public Order(Long id, Date dateCreated, String payment, String delivery, double total) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.payment = payment;
        this.delivery = delivery;
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", payment='" + payment + '\'' +
                ", delivery='" + delivery + '\'' +
                ", total=" + total +
                ", client=" + client +
                '}';
    }
}
