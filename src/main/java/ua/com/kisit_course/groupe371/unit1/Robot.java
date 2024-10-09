package ua.com.kisit_course.groupe371.unit1;

public class Robot {

    double x = 0;
    double y = 0;
    double course = 0;
    double speed = 0;
    double distance = 0;
    double totalDistance = 0;

    public void print(){
        System.out.println("X: " + x
        + ", Y: " + y
        + ", Course: " + course
        + ", Speed: " + speed
        + ", Distance: " + distance
        + ", TotalDistance:" + totalDistance);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", speed=" + speed +
                ", distance=" + distance +
                ", totalDistance=" + totalDistance +
                '}';
    }

    public static void main(String[] args) {

        Robot robot;
        robot = new Robot();

        System.out.println(robot.toString());

//        robot.print();

    }

}
