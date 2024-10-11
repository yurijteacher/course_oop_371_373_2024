package ua.com.kisit_course.groupe372.unit2;

import java.util.List;
import java.util.stream.Stream;

public class MyString {

    // psvm
    public static void main(String[] args) {
        /*
        Stack
        Heap

        byte
        short
        int
        long
        char
        boolean
        float
        double
         */

        double d;
        d = 4.5;

        int a = 5;
        int b = 3;

        System.out.println(a==b);

        System.out.println(a!=b);

        String text = "Hello World";
        String text2 = "Hello World";
        String text3 = new String("Hello World");

        System.out.println(text==text2);  // true
        System.out.println(text==text3);  // false


        System.out.println(text.hashCode());
        System.out.println(text2.hashCode());
        System.out.println(text3.hashCode());

        System.out.println(text.hashCode()==text2.hashCode());
        System.out.println(text.hashCode()==text3.hashCode());


        System.out.println(text.equals(text2)); // true
        System.out.println(text.equals(text3)); // true

        System.out.println(text.hashCode());
        text = text.concat("!!!");
        System.out.println(text.hashCode());

        System.out.println(text);

        System.out.println(text == text2);


        text = text + "qwdsad";
        text+= "sdfdsf";


        StringBuilder stringBuilder = new StringBuilder("Hello World!!!");
        System.out.println(stringBuilder.hashCode());

        stringBuilder = stringBuilder.append("1234");
        System.out.println(stringBuilder.hashCode());



        StringBuffer stringBuffer = new StringBuffer("Hello World");
        System.out.println(stringBuffer.hashCode());

        stringBuffer = stringBuffer.append("1234");
        System.out.println(stringBuffer.hashCode());

        /*
        String tex = "sad";
        String text2 = new String("sad);

        StringBuffer stringBuffer = new StringBuffer("Hello World");
        StringBuilder stringBuilder = new StringBuilder("Hello World");
         */

        /*
        text.equals(text2)
         */

        char[] chars =  {'J','A','V','A'};
        String str = new String(chars);

        char[] chars1 = str.toCharArray();
        System.out.println(chars1);

        chars1[0]  = 'C';

        System.out.println(chars1);


        String str1 = "I study Java !!";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        String str2 = "\n \t\r I study Java !! \f";
        System.out.println(str2.trim());

        String[] array = str1.split(" ");

        for (String s : array) {
            System.out.print(s + " ");
        }

        String str3 = "I study Java !!";
        System.out.println(str3.replaceAll("u\\B","--"));

        System.out.println(str3.replaceAll("!","."));

        System.out.println(str3.lastIndexOf('a'));


        List<String> list = Stream.of("Apple", "Banana", "Orange")
                .filter(e->e.equals("Apple") || e.equals("Banana"))
                .map(e->e + " Fruits")
                .toList();

        list.stream().forEach(System.out::println);










        /*
        JVM
          ========
          S  text1    text2
          ========
          H  "Hello World"
              - - - - -

         */





    }



}
