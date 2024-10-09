package ua.com.kisit_course.groupe373.unit3;

public class Main {

    // psvm + (tab)
    public static void main(String[] args) {

        /*
        byte -128 .. 127
        short -32,768 до 32,767
        int   -2,147,483,648 до 2,147,483,647
        long
        float
        double
         */

        byte b = 127;
        short s = b;
        System.out.println(s);

        short s1 = 126;
        byte b1 = (byte) s1;
        System.out.println(b1);

        short s3 = 130;
        byte b2 = (byte) s3;
        System.out.println(b2);

        int i = 32768;

        short s4 = (short) i;
        System.out.println(s4);

        float f = 3.14159265358979f;
        byte b5 = (byte) f;
        System.out.println(b5);

        String text = "Hello World";

        char[] chars = text.toCharArray();

        String str = new String(chars);
        System.out.println(str);

        String text2 = "3.14";

        double d1 = Double.parseDouble(text2);
        double d2 = Double.valueOf(text2);

        String text3 = d1 + "";
        String text4 = String.valueOf(d1+"");
        System.out.println(text4);

        try {
            text4 = 1+"";
            int a = Integer.parseInt(text4);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

}
