package ua.com.kisit_course.groupe373.unit2;

public class MyString {

    // psvm
    public static void main(String[] args) {

        /*
        byte
        short
        int
        long
        boolean
        char
        float
        double
         */

        int a = 5;
        int b = 2;
        System.out.println(a == b);
        System.out.println(a!=b);

        String text1 = "Hello World";
        String text2 = "Hello World";

        String text3 = new String("Hello World");

        System.out.println(text1 == text2);

        System.out.println(text1 == text3);

        System.out.println(text1.equals(text2));
        System.out.println(text1.equals(text3));

        System.out.println(text1.hashCode());
        System.out.println(text2.hashCode());
        System.out.println(text3.hashCode());
        System.out.println(text1.hashCode()==text2.hashCode());
        System.out.println(text2.hashCode()==text3.hashCode());
        System.out.println(text3.hashCode()==text1.hashCode());
        /*
        =========
        JVM
        =========
        S    text1 text2 text3
        =========
        H           "Hello World"
                    ----
                    ----
         */

        text1.concat("123");
        System.out.println(text1);

        text1 = text1.concat("123");
        System.out.println(text1);

        System.out.println(text1==text2);


        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("hc:" + sb.hashCode() + "," + sb.toString());

        sb = sb.append("123");
        System.out.println("hc:" + sb.hashCode() + "," + sb);

        StringBuilder stringBuilder = new StringBuilder("Hello World");
        System.out.println("hb:" + stringBuilder.hashCode() + "," + stringBuilder);
        stringBuilder.append("123");
        System.out.println("hb:" + stringBuilder.hashCode() + "," + stringBuilder);

        char[] chars = {'J','A','V','A'};

        String str = new String(chars);
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println(chars[0] == str.charAt(0));

        char[] chars1 = str.toCharArray();
        System.out.println(chars1);

        String text4 = "I study Java!!!";

        System.out.println(text4.toUpperCase());
        System.out.println(text4.toLowerCase());

        String[] arr = text4.split(" ");

        for (String s : arr) {
            System.out.print(s+" ");
        }

        String text5 = "\n     I study Java!    \n\n\t";

        System.out.println(text5.trim());
        System.out.println(text4.replaceAll("a","--"));


        System.out.println(text4.replaceAll("y\\b","--"));
        System.out.println(text4.replaceAll("a\\B","--"));

        System.out.println(text4.replaceAll("!","."));


    }

}
