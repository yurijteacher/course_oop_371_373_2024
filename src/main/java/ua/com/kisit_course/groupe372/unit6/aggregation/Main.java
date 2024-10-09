package ua.com.kisit_course.groupe372.unit6.aggregation;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Engine engine1 = new Engine(1L,"Model",3000, new Date(1999,10,11));
        Engine engine2 = new Engine(2L,"Model",3000, new Date(1999,10,11));

        Car bmw7 = new Car(1L, "BMW co", "bmw 7 s", "sad asd asd asd", engine1);

        bmw7.setEngine(engine2);

        System.out.println(bmw7);

        bmw7.setEngine(engine1);
        System.out.println(bmw7);



    }
}
