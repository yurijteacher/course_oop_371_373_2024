package ua.com.kisit_course.groupe372.unit6.aggregation;

import java.util.Date;
import java.util.logging.LoggingPermission;

public class Car {

    private Long id;
    private String name;
    private String model;
    private String description;
    private Engine engine;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car(String name, String model, String description, Engine engine) {
        this.name = name;
        this.model = model;
        this.description = description;
        this.engine = engine;
    }

    public Car(Long id, String name, String model, String description, Engine engine) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.description = description;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", engine=" + engine +
                '}';
    }
}


