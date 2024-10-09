package ua.com.kisit_course.groupe373.unit6.generalization;

public abstract class Robot {

    public abstract String print();

    public abstract void forward(double x, double y);

    private Long id = 1L;
    private String model = "";
    private double x = 0;
    private double y = 0;

    public Robot() {
    }

    public Robot(Long id, String model, double x, double y) {
        this.id = id;
        this.model = model;
        this.x = x;
        this.y = y;
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

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
