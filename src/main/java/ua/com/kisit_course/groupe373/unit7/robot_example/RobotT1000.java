package ua.com.kisit_course.groupe373.unit7.robot_example;

public class RobotT1000 extends Robot{

    public RobotT1000() {
    }

    public RobotT1000(Head head, Body body, Leg leg, Hand hand) {
        super(head, body, leg, hand);
    }

    @Override
    void dance() {
        System.out.println("RobotT1000 dance");
    }

    @Override
    void action() {
        System.out.println("RobotT1000 action");
    }

}
