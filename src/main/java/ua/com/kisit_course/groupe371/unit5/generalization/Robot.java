package ua.com.kisit_course.groupe371.unit5.generalization;

public abstract class Robot {

    public abstract void forward();

    public abstract String print();


    private Long id = 0L;
    private String name = "";
    private double x = 0.0;
    private double y = 0.0;
    private double speed = 0.0;
    private double total = 0.0;
    private double distance = 0.0;
    private double course = 0.0;

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Robot() {}

    public Robot(Long id, String name, double x, double y, double speed, double total) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "RobotExt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", speed=" + speed +
                ", total=" + total +
                '}';
    }
}
