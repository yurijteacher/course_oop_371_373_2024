package ua.com.kisit_course.groupe371.unit4.robot_manager;

import ua.com.kisit_course.groupe371.unit4.robot.Default_Robot;
import ua.com.kisit_course.groupe371.unit4.robot.PublicRobot;

public class RobotManager {

    public static void main(String[] args) {

        Default_Robot defaultRobot = new Default_Robot();
        System.out.println(defaultRobot.toString());


        PublicRobot publicRobot = new PublicRobot();
        System.out.println(publicRobot.x + publicRobot.y + publicRobot.z);

    }


}
