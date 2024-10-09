package ua.com.kisit_course.groupe371.unit5.generalization.example;

public class RobotExt extends Robot {

    public RobotExt() {
    }


    public RobotExt(double x, double y, double course, double distance, double total) {
        super(x, y, course, distance);
        this.total = total;
    }

    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public void forward() {
        super.forward();
        total +=getDistance();
    }

    @Override
    public String toString() {
        return super.toString() + ", total: " + total;
    }
}
