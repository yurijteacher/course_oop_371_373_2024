package ua.com.kisit_course.groupe371.unit5.generalization;

import static java.lang.Math.*;

public class RobotExt extends Robot {

    @Override
    public void forward() {
        double x = getX() + getDistance() * cos(getCourse() * PI / 180);
        double y = getY() + getDistance() * sin(getCourse() * PI / 180);
        setX(x);
        setY(y);

        setTotal(getTotal()+getDistance());
    }

    @Override
    public String print() {
        return "Robot T1000";
    }

    public static void main(String[] args) {


        RobotExt robotExt = new RobotExt();
        System.out.println(robotExt);

        robotExt.setName("T1000");
        robotExt.setId(1L);

        robotExt.setCourse(45);
        robotExt.setDistance(100);
        robotExt.forward();

        System.out.println(robotExt);

    }


}
