package ua.com.kisit_course.groupe371.unit5.association.many_to_many.v2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Long id;
    private String user;
    private Date dateCreated;


    public Order() {
    }

    public Order(Long id, String user, Date dateCreated) {
        this.id = id;
        this.user = user;
        this.dateCreated = dateCreated;
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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }


    // get/set
    // const
}
