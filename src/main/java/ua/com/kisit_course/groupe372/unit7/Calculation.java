package ua.com.kisit_course.groupe372.unit7;

public interface Calculation {

    final double f = 0;

    double add(double a, double b);
    double sub(double a, double b);

    default double mul(double a, double b){
        return a * b;
    };

    static double div(double a, double b) {

//        if(b != 0){
//            return a / b;
//        } else
//            return 0;

        return (b!=0) ? a/b : 0;
    };

}
