package ua.com.kisit_course.groupe372.unit5;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class Robot {

    private double x = 0;
    private double y = 0;

    private double course = 0;
    private double distance = 0;

    private List<RobotLine> lines = new ArrayList<>();

    public List<RobotLine> getLines() {
        return lines;
    }

    public void setLines(List<RobotLine> lines) {
        this.lines = lines;
    }

    public void forward(){
        double templX = x;
        double templY = y;

        x += distance * cos(course * PI / 180);
        y += distance * sin(course * PI / 180);

//        // v1 Іменний об'єкт
//        RobotLine robotLine = new RobotLine(templX, templY, x, y);
//        lines.add(robotLine);

        // v2 анонімний об'єкт
        lines.add(new RobotLine(templX, templY, x, y));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Robot() {}

    public Robot(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }
}
