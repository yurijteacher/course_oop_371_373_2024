package ua.com.kisit_course.groupe373.unit4.robot;

public class PrivateRobot {

    private double x = 0;
    private double y = 0;
    private double distance = 0;
    private double course = 0;
    private double speed = 0;

    public PrivateRobot() {
    }

    public PrivateRobot(double x, double y, double distance, double course, double speed) {
        this.x = x;
        this.y = y;
        this.distance = distance;
        this.course = course;
        this.speed = speed;
    }

    public static void main(String[] args) {

        PrivateRobot robot = new PrivateRobot(5, 5, 5, 5, 5);
        robot.x = 5;
        robot.y = 5;

    }

}
