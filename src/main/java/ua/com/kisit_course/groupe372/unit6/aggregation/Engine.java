package ua.com.kisit_course.groupe372.unit6.aggregation;


import java.util.Date;

public class Engine {

    private Long id;
    private String model;
    private int power;
    private Date date;

    public Engine() {
    }

    public Engine(Long id, String model, int power, Date date) {
        this.id = id;
        this.model = model;
        this.power = power;
        this.date = date;
    }

    public Engine(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", power=" + power +
                ", date=" + date +
                '}';
    }
}
