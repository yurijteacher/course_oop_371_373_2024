package ua.com.kisit_course.groupe373.unit2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyReg {

    public static void main(String[] args) {

//        String pattern = "How is the time";

//        String pattern ="[ a-zH]+";
        String pattern ="[a-zA-Z! ]+";
//        String pattern = "[ \\.|0-9a-zA-Z]+";



        /*
        . - будь-які значення алфавіту
        [0-9a-zA-Z_] \w
        [0-9] \d - цифри
        [^0-9] \D - всі символи, окрім цифр
        \b - границя слова
        \B не границя слова
        \s - спеціальні символи (\n \f \r \t)
        \S - ^s
         */

        /*
        X? входження 0 або 1 раз
        X* може повторюватись n-разів
        X+
        X{n}
        X{n,m}
        X{n,} n>
        ^[] - початок регулярного виразу
        []$ - заверешення регулярного виразу
         */


//        String text = "How is the time 1234.";
        String text ="Hello Student!!";




        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if(m.matches()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println( m.matches() ? true : false );

    }


}
