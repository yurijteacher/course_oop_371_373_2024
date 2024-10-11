package ua.com.kisit_course.groupe372.unit7.robot_example;

import ua.com.kisit_course.groupe372.unit7.robot_example.apple.AppleHead;
import ua.com.kisit_course.groupe372.unit7.robot_example.samsung.SamsungBoby;
import ua.com.kisit_course.groupe372.unit7.robot_example.samsung.SamsungHand;
import ua.com.kisit_course.groupe372.unit7.robot_example.sony.SonyHead;
import ua.com.kisit_course.groupe372.unit7.robot_example.sony.SonyLeg;

public class Test {

    public static void main(String[] args) {

//        Robot robot = new Robot();
        AppleHead appleHead = new AppleHead();
        SamsungBoby samsungBoby = new SamsungBoby();
        SamsungHand samsungHand = new SamsungHand();
        SonyHead sonyHead = new SonyHead();
        SonyLeg sonyLeg = new SonyLeg();

        Robot robotT1000 = new RobotT1000(samsungBoby, samsungHand, appleHead, sonyLeg);
        Robot robotT1001 = new RobotT1000(samsungBoby, samsungHand, sonyHead, sonyLeg);

        System.out.println(robotT1000);
        robotT1000.dance();
        robotT1000.action();

        System.out.println(robotT1001);




    }

}
