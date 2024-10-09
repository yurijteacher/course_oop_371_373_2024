package ua.com.kisit_course.groupe372.unit5;

public class RobotExt extends Robot {

    private double totalDistance = 0;


    public RobotExt() {}


    public RobotExt(double x, double y, double course, double distance) {
        super(x, y, course, distance);
    }

    public RobotExt(double x, double y, double course, double distance, double totalDistance) {
        super(x, y, course, distance);
        this.totalDistance = totalDistance;
    }

    @Override
    public void forward() {
        super.forward();
        totalDistance += super.getDistance();
    }

    @Override
    public String toString() {
        return super.toString() + ", totalDistance: " + totalDistance;
    }
}
