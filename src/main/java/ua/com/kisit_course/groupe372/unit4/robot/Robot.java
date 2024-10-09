package ua.com.kisit_course.groupe372.unit4.robot;

public class Robot {

    double x = 0;
    double y = 0;
    double course = 0;
    double speed = 0;
    double distance = 0;

    public Robot() {}

    public Robot(double x, double y, double course, double speed, double distance){
        // x = x;
        this.x = x;
        this.y = y;
        this.course = course;
        this.speed = speed;
        this.distance = distance;
    }


    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", speed=" + speed +
                ", distance=" + distance +
                '}';
    }

    public Robot(double x) {
        this.x = x;
    }

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

//    public Robot(double seed, double distance) {
//        this.speed = seed;
//        this.distance = distance;
//    }

    public void Robot(double seed, double distance){
        this.speed = seed;
        this.distance = distance;
    }


    public Robot(double x, double y, double course) {
        this.x = x;
        this.y = y;
        this.course = course;
    }

    public Robot(double x, double y, double course, double speed) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.speed = speed;
    }

    public static void main(String[] args) {

        Robot robot = new Robot();
        System.out.println(robot.toString());

        Robot robot1 = new Robot(100,101,45,45,100);
        System.out.println(robot1);

        robot1.Robot(1,2);
        System.out.println(robot1.toString());

        robot1.x = 5;
        robot1.y = 10;
        robot1.speed = 300;
        robot1.course = 1000;

        System.out.println(robot1);

        System.out.println(robot1.x + " "
                + robot1.y + " "
                + robot1.course + " "
                + robot1.speed + " "
                + robot1.distance);
    }


}
