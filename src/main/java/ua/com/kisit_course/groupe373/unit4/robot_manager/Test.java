package ua.com.kisit_course.groupe373.unit4.robot_manager;

import ua.com.kisit_course.groupe372.unit4.robot.Robot;
import ua.com.kisit_course.groupe373.unit4.robot.RobotTeacher;
import ua.com.kisit_course.groupe373.unit4.robot.PrivateRobot;
import ua.com.kisit_course.groupe373.unit4.robot.PublicRobot;

public class Test {

    public static void main(String[] args) {

        Robot robot = new Robot();
        // robot.x=4;
        // robot.y=5;
        System.out.println(robot);

        PublicRobot robot1 =  new PublicRobot();
        robot1.x = 5;
        robot1.y = 5;
        robot1.distance = 34;

        PrivateRobot privateRobot = new PrivateRobot();
        // privateRobot.x = 4;

        RobotTeacher robotTeacher = new RobotTeacher();
//        robotTeacher.x = 10;
//        robotTeacher.y = 20;
        robotTeacher.model = "wqewq";

    }

}
