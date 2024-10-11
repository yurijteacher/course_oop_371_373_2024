package ua.com.kisit_course.groupe373.unit7;

// Alt + Ent - Windows
// Option + Ent - MacOs

public class Calc implements Calculation{

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double sub(double a, double b) {
        return a-b;
    }


}
