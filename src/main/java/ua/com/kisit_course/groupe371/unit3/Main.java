package ua.com.kisit_course.groupe371.unit3;

public class Main {

    public static void main(String[] args) {

        /*
        byte -128 .. 127
        short -32768 : 32767
        int -2147483648 : 2147483647
        long: -9223372036854775808 : 9223372036854775807
        float
        double
         */

        short shMin = Short.MIN_VALUE;
        short shMax = Short.MAX_VALUE;
        System.out.println(shMin + " : " + shMax);

        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;
        System.out.println(intMin + " : " + intMax);

        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println(longMin + " : " + longMax);

        byte byte1 = 127;
        int int1 = byte1;
        System.out.println(int1);

        short sh1 = 129;
        byte byte2 = (byte) sh1;
        System.out.println(byte2);

        double d2 = 4.5;
        int int2 = (int) d2;
        System.out.println(int2);

        String text = "Hello World";

        char[] chars = text.toCharArray();

        String text2 = new String(chars);
        System.out.println(text2);

        String text3 = String.valueOf(d2);
        text3 = d2 + "";

        double db3 =  Double.parseDouble(text3);
        System.out.println(db3);
        db3 = Double.valueOf(text3);
        System.out.println(db3);

    }

}
