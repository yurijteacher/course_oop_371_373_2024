package ua.com.kisit_course.groupe371.unit4.robot;

public class Default_Robot {

        double x = 0; // = 0;
        double y = 0;
        double z = 0;

        double course = 0;
        double distance = 0;
        double speed = 0;

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

        Default_Robot robot = new Default_Robot();
        robot.x = 4;
        robot.y = 5;
        robot.z = 6;


        System.out.println(robot.course);
        robot.course =100;

        System.out.println(robot);

    }


}
