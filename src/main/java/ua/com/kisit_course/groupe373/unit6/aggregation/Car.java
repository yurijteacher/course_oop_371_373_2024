package ua.com.kisit_course.groupe373.unit6.aggregation;

public class Car {

    private Long id;
    private String name;
    private Engine engine;

    public Car() {
    }

    public Car(Long id, String name, Engine engine) {
        this.id = id;
        this.name = name;
        this.engine = engine;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
