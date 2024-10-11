package ua.com.kisit_course.groupe371.unit2;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
            String[] validPhoneNumbers = {
                    "380505923502", "+380505923502", "+38 050 592 35 02", "+38 (050) 592 35 02",
                    "+38 (050) 592-35-02", "+38 (050) 592-3-502", "(050) 592-35-02", "050 592 35 02",
                    "050 592 35 02", "050 592 3502", "050 592 3 502", "050-592-3-502",
                    "+80 (50) 592 35 02", "380 (50) 592 35 02", "+380 (50) 592 35 02",
                    "+380 (50) 592 35 02", "+380 (50) 592-35-02", "+380 50 592-35-02"
            };

            // Регулярний вираз для телефонних номерів
            String phoneNumberPattern = "^\\+?(\\d{1,3})?\\s?\\(?\\d{2,3}\\)?[\\s\\-]?\\d{2,3}[\\s\\-]?\\d{2}[\\s\\-]?\\d{2,4}$";

            Pattern pattern = Pattern.compile(phoneNumberPattern);

            for (String phoneNumber : validPhoneNumbers) {
                if (pattern.matcher(phoneNumber).matches()) {
                    System.out.println(phoneNumber + " is valid.");
                } else {
                    System.out.println(phoneNumber + " is invalid.");
                }
            }
    }

}
