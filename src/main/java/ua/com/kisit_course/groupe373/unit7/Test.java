package ua.com.kisit_course.groupe373.unit7;


public class Test {

    public static void main(String[] args) {

        Calc calc = new Calc();
        System.out.println(calc.add(3, 5));
        System.out.println(calc.sub(5, 3));

        System.out.println(calc.mul(10, 3));
        // calc.div(123,2);
        System.out.println(Calculation.div(10, 5));
    }

}
