package ua.com.kisit_course.groupe373.unit4.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String[] phoneNumbers = {
                "380505923502", "+380505923502", "+38 050 592 35 02", "+38 (050) 592 35 02",
                "+38 (050) 592-35-02", "+38 (050) 592-3-502", "(050) 592-35-02",
                "050 592 35 02", "050 592 3502", "050 592 3 502", "050-592-3-502",
                "+80 (50) 592 35 02", "380 (50) 592 35 02", "+380 (50) 592 35 02",
                "+380 (50) 592-35-02", "+380 50 592-35-02"
        };

        // Регулярний вираз для перевірки різних форматів телефонних номерів
        String phoneNumberPattern = "^\\+?(380|38|80)?[-\\s]?(\\(?(050|\\d{3})\\)?)[-\\s]?((\\d{3})[-\\s]?(\\d{2})[-\\s]?(\\d{2})|\\d{3,4}[-\\s]?\\d{2,3})$";

        Pattern pattern = Pattern.compile(phoneNumberPattern);

        // Перевірка кожного номера
        for (String phoneNumber : phoneNumbers) {
            Matcher matcher = pattern.matcher(phoneNumber);
            if (matcher.matches()) {
                System.out.println(phoneNumber + " - valid");
            } else {
                System.out.println(phoneNumber + " - invalid");
            }
        }

    }


}
