package ua.com.kisit_course.groupe373.unit2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationEmail {

    public static void main(String[] args) {

        String email = "vas.ya.+-%pypkin_-1234.sdf@kneu-nauka.edu.ua";

        String pattern ="^[a-zA-Z0-9\\._%+-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z]{2,}$";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);

        System.out.println( m.matches() ? true : false);

    }


}
