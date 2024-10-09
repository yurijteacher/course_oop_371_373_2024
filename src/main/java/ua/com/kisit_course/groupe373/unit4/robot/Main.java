package ua.com.kisit_course.groupe373.unit4.robot;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.y = 5;
        robot.x = 10;
        robot.distance = 100;
        System.out.println(robot);


        PublicRobot robot1 = new PublicRobot();
        robot1.x = 20;
        robot1.y = 25;
        robot1.course = 100;
        System.out.println(robot1);

        PrivateRobot robot2 = new PrivateRobot();
        // robot2.x = 5;

        RobotTeacher r = new RobotTeacher();
        r.x = 0;

    }
}
