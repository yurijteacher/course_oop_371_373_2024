package ua.com.kisit_course.groupe373.unit11.entity;

import java.util.Date;

public class Orders {

    private int id;
    private Users user;

    private Date dateCreated;
    private String delivery;
    private String payment;
    public Orders() {
    }

    public Orders(int id, Users user, Date dateCreated, String delivery, String payment) {
        this.id = id;
        this.user = user;
        this.dateCreated = dateCreated;
        this.delivery = delivery;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
