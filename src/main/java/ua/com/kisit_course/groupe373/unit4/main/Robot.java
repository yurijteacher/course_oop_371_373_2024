package ua.com.kisit_course.groupe373.unit4.main;

public class Robot {

    double x = 0;
    double y = 0;
    double z = 0;

    double course = 0;
    double distance = 0;
    double speed = 0;

    public Robot() {}

    public Robot(double x) {
        this.x = x;
    }

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void Robot(double course, double distance) {
        this.course = course;
        this.distance = distance;
    }

    public Robot(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }



    public Robot(double x, double y, double z, double course) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.course = course;
    }

    public Robot(double x, double y, double z, double course, double distance) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.course = course;
        this.distance = distance;
    }

    public Robot(double x, double y, double z, double course, double distance, double speed) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.course = course;
        this.distance = distance;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x:" + x +
                ", y:" + y +
                ", z:" + z +
                ", course:" + course +
                ", distance:" + distance +
                ", speed:" + speed +
                "}";
    }

    // psvm + tab
    public static void main(String[] args) {

        Robot robot;
        robot = new Robot();

        System.out.println(robot.toString());

        Robot robot1 = new Robot(1,2,2,3,4,5);
        System.out.println(robot1);
        Robot robot2 = new Robot(1,2,3);
        System.out.println(robot2);

        robot2.Robot(4,5);
        System.out.println(robot2.toString());

    }

}
