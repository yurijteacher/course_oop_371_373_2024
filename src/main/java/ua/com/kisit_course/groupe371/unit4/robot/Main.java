package ua.com.kisit_course.groupe371.unit4.robot;

public class Main {

    public static void main(String[] args) {

        Default_Robot robot = new Default_Robot();

        System.out.println(robot.x + ", " + robot.y);

        PublicRobot robot1 = new PublicRobot();
        System.out.println(robot1.x + ", " + robot1.y);

        PrivateRobot robot2 = new PrivateRobot();
        //        robot2.x;
        //        robot2.y;

    }

}
