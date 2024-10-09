package ua.com.kisit_course.groupe373.unit5;

public class RobotExt extends Robot{

    private double totalDistance = 0;


    public RobotExt() {
    }

    public RobotExt(double x, double y, double course, double distance) {
        super(x, y, course, distance);
    }


    @Override
    public void forward(){
        super.forward();
        totalDistance += getDistance();

    }



    @Override
    public String toString() {
        return super.toString() + ", totalDistance=" + totalDistance;
    }
}
