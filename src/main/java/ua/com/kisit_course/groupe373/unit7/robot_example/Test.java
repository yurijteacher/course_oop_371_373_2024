package ua.com.kisit_course.groupe373.unit7.robot_example;

import ua.com.kisit_course.groupe373.unit7.robot_example.ibm.IbmBody;
import ua.com.kisit_course.groupe373.unit7.robot_example.ibm.IbmHand;
import ua.com.kisit_course.groupe373.unit7.robot_example.ibm.IbmHead;
import ua.com.kisit_course.groupe373.unit7.robot_example.ibm.IbmLeg;
import ua.com.kisit_course.groupe373.unit7.robot_example.sony.SonyBody;
import ua.com.kisit_course.groupe373.unit7.robot_example.sony.SonyHand;
import ua.com.kisit_course.groupe373.unit7.robot_example.sony.SonyHead;
import ua.com.kisit_course.groupe373.unit7.robot_example.sony.SonyLeg;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        IbmBody ibmBody = new IbmBody();
        IbmHead ibmHead = new IbmHead();
        IbmHand ibmHand = new IbmHand();
        IbmLeg ibmLeg = new IbmLeg();

        SonyBody sonyBody = new SonyBody();
        SonyHead sonyHead = new SonyHead();
        SonyLeg sonyLeg = new SonyLeg();
        SonyHand sonyHand = new SonyHand();

//        Robot robot = new Robot();
        Robot robotT1000 = new RobotT1000(ibmHead, sonyBody, ibmLeg, sonyHand);
        Robot robotT1001 = new RobotT1000(sonyHead, ibmBody, ibmLeg, sonyHand);
        Robot robotT1002 = new RobotT1000(sonyHead, sonyBody, sonyLeg, sonyHand);
        Robot robotT1003 = new RobotT1000(ibmHead, ibmBody, ibmLeg, ibmHand);

        List<Robot> robotList = new ArrayList<>();
        robotList.add(robotT1000);
        robotList.add(robotT1001);
        robotList.add(robotT1002);
        robotList.add(robotT1003);

        for (Robot robot : robotList) {
            System.out.println(robot);
        }

    }

}
