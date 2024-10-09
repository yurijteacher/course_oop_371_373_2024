package ua.com.kisit_course.groupe371.unit4.robot;

public class PublicRobot {

    public double x = 0; // = 0;
    public double y = 0;
    public double z = 0;

    public double course = 0;
    public double distance = 0;
    public double speed = 0;

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
        PublicRobot robot = new PublicRobot();

        System.out.println(robot.x);

    }


}
