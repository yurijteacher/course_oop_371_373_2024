package ua.com.kisit_course.groupe371.unit5.aggregation;

public class Test {

    public static void main(String[] args) {

        Engine engine1 = new Engine(1L, "as","as-1000",2000);
        Engine engine2 = new Engine(2L, "asp","asm-1000",2500);

        Car bmw7 = new Car(1L, "bmw 7","qwewqe","qwewqe qwewqe", engine1);
        System.out.println(bmw7);
        bmw7.setEngine(engine2);
        System.out.println(bmw7);
        bmw7.setEngine(engine1);
        System.out.println(bmw7);


    }

}
