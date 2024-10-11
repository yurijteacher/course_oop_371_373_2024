package ua.com.kisit_course.groupe371.unit6.robot_example;

public class RobotT1000 extends Robot{

    public RobotT1000() {
    }

    public RobotT1000(Body body, Hand hand, Head head, Leg leg) {
        super(body, hand, head, leg);
    }

    @Override
    void dance() {
        System.out.println("dance RobotT1000");
    }

    @Override
    void action() {
        System.out.println("action RobotT1000");
    }
}
