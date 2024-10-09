package ua.com.kisit_course.groupe372.unit4.base_robot;

public class RobotManager {

    public static void main(String[] args) {

        Robot robot = new Robot();

        robot.setCourse(45);
        robot.setDistance(100);

        System.out.println(robot);

        robot.forward();
        System.out.println(robot);

        robot.setCourse(90);
        robot.setDistance(200);
        robot.forward();
        System.out.println(robot);


        robot.setCourse(45);
        robot.setDistance(100);
        robot.forward();
        System.out.println(robot);

        Robot robot2;
        robot2 = new Robot(1,2,3,3);
    }

}
