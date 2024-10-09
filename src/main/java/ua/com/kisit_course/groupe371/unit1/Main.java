package ua.com.kisit_course.groupe371.unit1;

import java.util.Arrays;
import java.util.List;

public class Main {

    static int a1 = 3;
    static int b1 = 2;



    public static void main(String[] args) {

        System.out.println("Hello world!");

        String text = "Hello World!";
        System.out.println(text);

        char ch = 'q';
        System.out.println(ch);

        boolean logic = true; // false
        System.out.println(logic);

        byte b = 12;
        short s = 12;
        int i = 12;
        long l = 12L;
        float f = 12.0F;
        double d = 12.0;

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

//        for (int j = 0; ; j++) {
//            System.out.println(j);
//        }

        int j = 0;
        for (; j<5; ) {
            System.out.println(j);
            j++;
        }

        j=0;
        while (j<5){
            System.out.println(j);
            j++;
        }

        j=0;
        do {
            System.out.println(j);
            j++;
        } while (j<5);

        logic = false;

        if(!logic){
            System.out.println(false);
        } else {
            System.out.println(true);
        }

        logic = (!logic) ? false : true;
        System.out.println(logic);


        int c = a1+b1;

        sub(10,1);

        c = add(1,2);
        System.out.println(c);

        Robot1 robot1 = new Robot1();
        System.out.println(robot1);

        robot1.x = 1;
        robot1.y = 3;

        System.out.println(robot1);

        robot1.add(3,4);
        System.out.println(robot1);

        String text1 = new String("Hello World!");
        System.out.println(text1);

        String[] array = new String[]{"Hello", "World"};

        String[] array2 = new String[3];
        array2[0] = "C#";
        array2[1] = "Java";
        array2[2] = "Python";
//        array2[3] = "JavaScript";

        System.out.println(array2);

        System.out.println(Arrays.toString(array2));

        for (int k = 0; k < array2.length; k++) {
            System.out.print(array2[k]+",");
        }

        List<String> array3 = List.of("apple", "banana");
        System.out.println("\n" + array3);

        array3
                .stream()
                .forEach(e->System.out.println(e));

        array3.stream().forEach(System.out::println);

        String[] array4 = {"Hello", "World"};

    }

    static int add(int x, int y) {
        return x + y;
    }

    static void sub(int x, int y) {
        System.out.println(x - y);
    }




}