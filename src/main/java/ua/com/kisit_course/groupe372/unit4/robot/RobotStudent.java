package ua.com.kisit_course.groupe372.unit4.robot;

public class RobotStudent extends RobotTeacher{

    @Override
    public String toString() {

        return "RobotStudent{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", angle=" + angle +
                ", speed=" + speed +
                '}';
    }

    public static void main(String[] args) {

        RobotStudent robotStudent = new RobotStudent();
        robotStudent.x = 5;
        robotStudent.y = 5;

        robotStudent.speed = 100;

        System.out.println(robotStudent);


    }


}
