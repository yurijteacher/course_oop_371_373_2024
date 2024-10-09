package ua.com.kisit_course.groupe373.unit4.robot;

public class RobotTeacher {

    protected String name = "T1000";
    protected double x = 0 ;
    protected double y = 0 ;

    protected double course = 0;
    protected double distance = 0;
    private int age = 0;
    public String model = "T1000";

    public RobotTeacher() {}

    public RobotTeacher(String name, double x, double y, double course, double distance) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "RobotTeacher{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    public static void main(String[] args) {

        RobotTeacher rt = new RobotTeacher("T1000", 10, 10, 10, 10);
        rt.x = 0;

    }

}
