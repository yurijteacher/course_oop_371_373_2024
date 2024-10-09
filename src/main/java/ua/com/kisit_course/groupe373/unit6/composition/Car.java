package ua.com.kisit_course.groupe373.unit6.composition;

public class Car {

    private Long id;
    private String model;

    private Engine engine;

    public Car() {
        this.engine = new Engine(1L, "BMW25-s",2500);
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

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
