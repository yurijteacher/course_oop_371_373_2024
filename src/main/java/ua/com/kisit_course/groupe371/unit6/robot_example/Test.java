package ua.com.kisit_course.groupe371.unit6.robot_example;

import ua.com.kisit_course.groupe371.unit6.robot_example.apple.AppleBody;
import ua.com.kisit_course.groupe371.unit6.robot_example.apple.AppleHead;
import ua.com.kisit_course.groupe371.unit6.robot_example.ibm.IbmBody;
import ua.com.kisit_course.groupe371.unit6.robot_example.ibm.IbmHead;
import ua.com.kisit_course.groupe371.unit6.robot_example.samsung.SamsungHand;
import ua.com.kisit_course.groupe371.unit6.robot_example.samsung.SamsungLeg;

public class Test {

    public static void main(String[] args) {

        // Robot robot = new Robot();

        IbmBody ibmBody = new IbmBody();
        IbmHead ibmHead = new IbmHead();

        SamsungHand samsungHand = new SamsungHand();
        SamsungLeg samsungLeg =new SamsungLeg();

        AppleHead appleHead = new AppleHead();
        AppleBody appleBody = new AppleBody();

        Robot robot = new RobotT1000(appleBody, samsungHand, appleHead, samsungLeg);
        System.out.println(robot);

        Robot robot2 = new RobotT1000(ibmBody, samsungHand, ibmHead, samsungLeg);
        System.out.println(robot2);
    }

}
