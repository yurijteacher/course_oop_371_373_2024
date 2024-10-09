package ua.com.kisit_course.groupe373.unit4.robot;

public class Robot {

    double x = 0;
    double y = 0;

    double course = 0;
    double distance = 0;
    double speed = 0;

    public Robot() {}

    public Robot(double x, double y, double course, double distance, double speed) {
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

        Robot robot = new Robot();
        System.out.println(robot.toString());
        robot.x = 1;
        robot.y = 2;
        robot.course = 3;
        robot.distance = 4;
        robot.speed = 5;

        System.out.println(robot);

    }
}
