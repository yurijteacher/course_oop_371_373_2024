package ua.com.kisit_course.groupe371.unit6;

// All + Ent - Windows
// Option + Ent - MacOs

public class Calc implements Calculation, Information{

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double sub(double a, double b) {
        return a-b;
    }

}
