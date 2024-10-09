package ua.com.kisit_course.groupe371.unit5.generalization.example;


public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.setCourse(45);
        robot.setDistance(100);
        robot.forward();
        System.out.println(robot);

        RobotExt robotExt = new RobotExt();
        robotExt.setCourse(45);
        robotExt.setDistance(100);
        robotExt.forward();
        System.out.println(robotExt);
    }

}
