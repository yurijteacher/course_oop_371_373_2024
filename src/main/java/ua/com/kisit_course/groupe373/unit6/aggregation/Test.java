package ua.com.kisit_course.groupe373.unit6.aggregation;

public class Test {

    public static void main(String[] args) {

        Engine engine1 = new Engine(1L, "seat", 2500);
        Engine engine2 = new Engine(2L, "seat1", 3500);

        Car seat2000= new Car(1L, "asd", engine1);
        System.out.println(seat2000);

        seat2000.setEngine(engine2);
        System.out.println(seat2000);


    }

}
