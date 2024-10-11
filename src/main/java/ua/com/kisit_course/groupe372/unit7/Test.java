package ua.com.kisit_course.groupe372.unit7;

public class Test {

    public static void main(String[] args) {
        Calc calculation = new Calc();

        calculation.printInformation();

        System.out.println(calculation.add(3, 5));

        System.out.println(calculation.sub(5, 3));

        System.out.println(calculation.mul(5, 3));

        System.out.println(Calculation.div(10,2));


    }

}
