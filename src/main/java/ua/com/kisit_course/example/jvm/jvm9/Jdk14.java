package ua.com.kisit_course.example.jvm.jvm9;

public class Jdk14 {


    public static void main(String[] args) {

        // до
        Days days = Days.MONDAY;
        switch (days) {
            case MONDAY:
                System.out.println("It is monday");
            default: {
                System.out.println("It's not a day!");
            }
        }


        var str = switch (days) {
            case FRIDAY -> "It is monday";
            default -> "It's not a day!";
        };
        System.out.println(str);
    }

    private enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }


}
