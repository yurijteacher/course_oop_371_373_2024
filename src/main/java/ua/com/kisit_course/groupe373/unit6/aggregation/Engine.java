package ua.com.kisit_course.groupe373.unit6.aggregation;

public class Engine {

    private Long id;
    private String model;
    private int power;

    public Engine() {
    }

    public Engine(Long id, String model, int power) {
        this.id = id;
        this.model = model;
        this.power = power;
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

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
