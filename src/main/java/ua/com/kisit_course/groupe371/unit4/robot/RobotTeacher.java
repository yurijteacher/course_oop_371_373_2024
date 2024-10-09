package ua.com.kisit_course.groupe371.unit4.robot;

public class RobotTeacher {

    protected double x = 0; // = 0;
    protected double y = 0;
    protected double z = 0;

    protected double course = 0;
    protected double distance = 0;
    protected double speed = 0;

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

        RobotTeacher robot = new RobotTeacher();
        robot.x = 4;
        robot.y = 5;
        robot.z = 6;


        System.out.println(robot.course);
        robot.course = 100;

        System.out.println(robot);

    }

}
