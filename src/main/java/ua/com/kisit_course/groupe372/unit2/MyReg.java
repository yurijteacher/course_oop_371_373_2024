package ua.com.kisit_course.groupe372.unit2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyReg {

    public static void main(String[] args) {

//        String pattern = "I study Java.";

        String pattern ="[ JIa-z\\.]+";

        /*
        [...] =X
        X+
        X? 0,1 раз
        X{n} n
        X{n,m} [n,m]
        X{n,} n>2
        X*
        . - будь-які символи
        [a-zA-Z]
        [0-9]+  \\d
        [^0-9]  \\D
        [a-zA-Z0-9]
        [a-zA-Z0-9_]  \\w
        [^a-zA-Z0-9_] \\ W
        [abc]
        [abc|xyz]  |- або

        "^[...  - початок регулярного виразу
        ]..$" - кінець
        \t
        \r
        \f
        \p
        \\s - робота із спеціальними символами \t\r\f\n
        \\S - заперечення спеціальних символів
        \\b -  границя слова
        \\B - в середині слова
         */

        String text = "I study Java.";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if(m.matches()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }




    }


}
