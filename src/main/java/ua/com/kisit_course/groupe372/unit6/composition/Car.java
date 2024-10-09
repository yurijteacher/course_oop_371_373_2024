package ua.com.kisit_course.groupe372.unit6.composition;

import java.util.Date;

public class Car {

    private String name;
    private String model;
    private String description;
    private Engine engine;

    public Car() {
        engine = new Engine(1L,"12",2000, new Date(2000,2,2));
    }

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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", engine=" + engine +
                '}';
    }
}
