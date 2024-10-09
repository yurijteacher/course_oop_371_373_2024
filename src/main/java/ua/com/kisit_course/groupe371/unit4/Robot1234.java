package ua.com.kisit_course.groupe371.unit4;

public class Robot1234 {

    double x = 0; // = 0;
    double y = 0;
    double z = 0;

    double course = 0;
    double distance = 0;
    double speed = 0;

    public Robot1234(){}

    public Robot1234(double x, double y, double z, double course, double distance, double speed){
        this.x = x; // 5=5;
        this.y = y;
        this.z = z;
        this.course = course;
        this.distance = distance;
        this.speed = speed;
    }

    public Robot1234(double x) {
        this.x = x;
    }

    public Robot1234(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void Robot1234(double course, double distance) {
        this.course = course;
        this.distance = distance;
    }


    public Robot1234(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Robot1234(double x, double y, double z, double course) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.course = course;
    }

    public Robot1234(double x, double y, double z, double course, double distance) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.course = course;
        this.distance = distance;
    }

    @Override
    public String toString(){

        return "Robot{" +
                "x:" + x +
                ",y:" + y +
                ",z:" + z +
                ",course:" + course +
                ",distance:" + distance +
                ",speed:" + speed +
                "}";
    }


    // psvm + Tab
    public static void main(String[] args) {

        Robot1234 robot;
        robot = new Robot1234(); // x= 0, y =0, ...

        Robot1234 robot1 = new Robot1234(1,2,3,4,5,60);

        System.out.println(robot.toString());
        System.out.println(robot1);

        robot1.Robot1234(45, 1000);
        System.out.println(robot1);

    }

}
