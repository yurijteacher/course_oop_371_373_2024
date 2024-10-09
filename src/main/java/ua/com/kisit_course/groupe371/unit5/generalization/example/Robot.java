package ua.com.kisit_course.groupe371.unit5.generalization.example;

import static java.lang.Math.*;

public class Robot {

    private double x = 0;
    private double y = 0;
    private double course = 0;
    private double distance = 0;

    public void forward(){
        x += distance * cos(course* PI/180);
        y += distance * sin(course* PI/180);
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

    public Robot() {
    }

    public Robot(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
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
}