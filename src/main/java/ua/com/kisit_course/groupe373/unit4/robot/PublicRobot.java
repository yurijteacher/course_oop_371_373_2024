package ua.com.kisit_course.groupe373.unit4.robot;

public class PublicRobot {

    public double x = 0;
    public double y = 0;

    public double course = 0;
    public double distance = 0;
    public double speed = 0;

    public PublicRobot() {}

    public PublicRobot(double x, double y, double course, double distance, double speed) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                ", speed=" + speed +
                '}';
    }

    // psvm + Tab
    public static void main(String[] args) {

        PublicRobot robot = new PublicRobot();
        System.out.println(robot.toString());
        robot.x = 1;
        robot.y = 2;
        robot.course = 3;
    }
}
