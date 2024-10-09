package ua.com.kisit_course.groupe372.unit2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationEmail {

    public static void main(String[] args) {

//        String pattern = "[0-9]+";
//        String pattern = "[0-9]+[\\.]?[0-9]+";

//        int a = 22224;
//        double d = 2.42312;

        String pattern = "[a-zA-Z]+[\\.\\w]+@[\\w]+[\\.\\w]+[\\w]{2,}";

        String email = "vasya.as_1234.wq4e@kisiw123t.gov.ua"; // [a-zA-Z]+[\\.a-zA-Z0-9_]    @    //[\\w]{2,}


        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);

        System.out.println((m.matches() ? true : false));


    }

}
