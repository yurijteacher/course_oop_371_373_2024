package ua.com.kisit_course.groupe371.unit4.robot;

public class PrivateRobot {

    private double x = 0; // = 0;
    private double y = 0;
    private double z = 0;

    private double course = 0;
    private double distance = 0;
    private double speed = 0;

    @Override
    public String toString() {
        return "Default_Robot{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", course=" + course +
                ", distance=" + distance +
                ", speed=" + speed +
                '}';
    }

    public static void main(String[] args) {

        PrivateRobot robot = new PrivateRobot();

        robot.x = 4;
        robot.y = 5;
        robot.z = 6;


        System.out.println(robot.course);
        robot.course =100;

        System.out.println(robot);

    }

}
