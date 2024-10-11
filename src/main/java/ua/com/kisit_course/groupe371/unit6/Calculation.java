package ua.com.kisit_course.groupe371.unit6;

public interface Calculation {

    final double z = 5;

    double add(double a, double b);
    double sub(double a, double b);

    static double mul(double a, double b){
        return a * b;
    };

    default double div(double a, double b){

//        if(b!=0){
//            return a/b;
//        } return 0;

        return (b!=0) ? a/b : 0;
    };

}
