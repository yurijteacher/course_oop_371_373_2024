package ua.com.kisit_course.groupe373.unit1;

import java.util.Arrays;
import java.util.List;

public class First {


    static int a1 = 5;
    static int b1 = 5;


    public static void main(String[] args) {

        String text = "Hello world!!";
        System.out.println(text);
        String text2 = new String("Hello world!!");
        System.out.println(text2);

        char ch = 'w';
        System.out.println(ch);

        boolean logic = true; // false
        System.out.println(logic);

        byte by = 127;
        System.out.println(by);

        short sh = 5;
        System.out.println(sh);

        long l = 5;
        System.out.println(l);

        int i = 5;
        System.out.println(i);

        float f = 5.0f;
        System.out.println(f);

        double d = 5.0;
        System.out.println(d);


        // for
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        int j = 0;
        for (; j < 10; j++) {
            System.out.print(+j+",");
        }

        System.out.println();
        j = 0;
        for (; j < 10; ) {
            System.out.print(+j+",");
            j++;
        }

        // while
        j=0;
        while (j < 10) {
            System.out.print(+j+",");
            j++;
        }

//        System.out.println();
//        j = 0;
//        for (; ; ) {
//            System.out.print(+j+",");
//            j++;
//        }

        // do-while
        System.out.println();
        j=0;
        do{

            System.out.print(j+",");
            j++;
        } while (j<10);


        logic = false;
        if(logic){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        logic = (logic==true) ? true : false;
        System.out.println(logic);

//        if (){
//
//        } else if () {
//
//        } else {
//
//        }

        double first = 5.5;
        double second = 4.5;
        double third = 0;

        String operator = "*";

        switch (operator){
            case ("+"): third = first + second;
                System.out.println(third);
                break;
            case ("-"): third = first - second;
                System.out.println(third);
                break;
            case ("*"): third = first * second;
                System.out.println(third);
                break;
            case ("/"): third = (second!=0) ? first/second : 0;
                System.out.println(third);
                break;
        }

        String[] array = new String[3];
        array[0] = "C#";
        array[1] = "Java";
        array[2] = "Python";
        // array[3] = "JavaScript";

        String[] array1 = new String[]{"C#", "Java", "Python"};
        String[] array2 = {"C#", "Java", "Python"};
        char[] array3 = {'J','A','V','A',};
        char[] array4 = new String("C#").toCharArray();

        System.out.println(array1);

        for (int k = 0; k < array1.length; k++) {
            System.out.println(array1[k]);
        }

        System.out.println(Arrays.toString(array1));

        List<String> list = List.of("C#", "Java", "JavaScript");
        System.out.println(list);

        System.out.println(a1+b1);

        print(5,7);
        int c1 = print1(10, 4);
        System.out.println(c1);
    }

    public static void print(double a, double b) {
        System.out.println(a+b);
    }

    public static int print1(int a, int b) {
        return a-b;
    }

}
