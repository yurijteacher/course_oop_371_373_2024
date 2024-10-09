package ua.com.kisit_course.groupe372.unit4.robot_manager;

import ua.com.kisit_course.groupe372.unit4.robot.PublicRobot;
import ua.com.kisit_course.groupe372.unit4.robot.Robot;
import ua.com.kisit_course.groupe372.unit4.robot.RobotStudent;
import ua.com.kisit_course.groupe372.unit4.robot.RobotTeacher;

public class Test {

    public static void main(String[] args) {

        Robot robot = new Robot();
        // robot.x = 5;
        // robot.y = 10;

        System.out.println(robot);

        PublicRobot robot1 = new PublicRobot();
        robot1.x = 100;
        robot1.y = 100;

        System.out.println(robot1);

        RobotTeacher robotTeacher = new RobotTeacher();
        // robotTeacher.x = 0;

        RobotStudent robotStudent = new RobotStudent();
        System.out.println(robotStudent);
    }

}
