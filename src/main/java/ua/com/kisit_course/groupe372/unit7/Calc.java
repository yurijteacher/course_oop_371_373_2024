package ua.com.kisit_course.groupe372.unit7;

// Mac - Opt + Ent
// Windows - Alt + Ent

public class Calc implements Calculation, Information{

    @Override
    public void printInformation() {
        Information.super.printInformation();
    }

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double sub(double a, double b) {
        return a-b;
    }


}
