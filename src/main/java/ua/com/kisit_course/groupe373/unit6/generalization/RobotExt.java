package ua.com.kisit_course.groupe373.unit6.generalization;

public class RobotExt extends Robot {

    private Long totalDistance = 200L;

    @Override
    public String print() {

        return "wq4";
    }

    @Override
    public void forward(double x, double y) {

    }

    public RobotExt() {}

    public RobotExt(Long id, String model, double x, double y) {
        super(id, model, x, y);
    }

    @Override
    public String toString() {
        return super.toString() + " RobotExt" + totalDistance;
    }
}
