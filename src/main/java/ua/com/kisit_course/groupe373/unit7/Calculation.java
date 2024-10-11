package ua.com.kisit_course.groupe373.unit7;

public interface Calculation {

    final double d = 5; //

    double add(double a, double b);
    double sub(double a, double b);

    default double mul(double a, double b){
        return a * b;
    };

    static double div(double a, double b){
        return (b!=0) ? a/b : 0;
    };

}
