package ua.com.kisit_course.groupe373.unit4.robot_manager;

import ua.com.kisit_course.groupe373.unit4.robot.RobotTeacher;

public class RobotStudent extends RobotTeacher {

    @Override
    public String toString() {
        return "RobotStudent{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    public static void main(String[] args) {

        RobotStudent student = new RobotStudent();
        student.x = 5;
        student.y = 5;
        student.course = 6;
        student.distance = 7;
        System.out.println(student);
//        student.age = 0;
        student.model = "T2000";

    }

}
