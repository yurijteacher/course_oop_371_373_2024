package ua.com.kisit_course.groupe372.unit4.robot;

public class PublicRobot {

    public double x = 5;
    public double y = 10;
    private double course = 45;

    @Override
    public String toString() {
        return "PublicRobot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                '}';
    }

    public static void main(String[] args) {

        PublicRobot robot = new PublicRobot();
        robot.x = 5;
        robot.y = 10;
        robot.course = 45;

        System.out.println(robot.toString());

    }
}
