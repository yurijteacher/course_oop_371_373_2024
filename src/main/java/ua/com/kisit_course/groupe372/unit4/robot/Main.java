package ua.com.kisit_course.groupe372.unit4.robot;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.x = 5;
        robot.y = 5;
        robot.course = 5;

        System.out.println(robot);
        //

        PublicRobot robot1 = new PublicRobot();
        robot1.x = 10;

        System.out.println(robot1);

        PrivateRobot robot2 = new PrivateRobot();
        // robot2.x = 0;
        // robot2.y = 0;

    }

}
