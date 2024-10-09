package ua.com.kisit_course.groupe373.unit6.composition;

import ua.com.kisit_course.groupe373.unit6.association.one_to_many.Category;

public class test {
    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("sad");
        car.setId(1L);

        System.out.println(car);

    }
}
