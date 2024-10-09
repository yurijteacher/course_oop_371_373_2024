package ua.com.kisit_course.groupe373.unit2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationEmail {

    public static void main(String[] args) {

        String email = "Vasya.pypkin_1234.sdf@kneu.edu.ua";

        String pattern ="[a-zA-Z]+[\\.\\w]+@[\\w]+[\\.\\w]+[\\w]{2,}";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);

        System.out.println( m.matches() ? true : false);

    }


}
