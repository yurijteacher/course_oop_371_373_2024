package ua.com.kisit_course.groupe371.unit6;

public class Test {

    public static void main(String[] args) {

        Calc calc = new Calc();
        System.out.println(calc.add(3, 5));
        System.out.println(calc.sub(3, 5));
        System.out.println(Calculation.mul(3,3));
        System.out.println(calc.div(10, 2));

        calc.info();

    }
}
