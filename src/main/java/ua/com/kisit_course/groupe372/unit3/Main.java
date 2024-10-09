package ua.com.kisit_course.groupe372.unit3;

public class Main {

    /*
    byte [-128 , 127]
    short [-32768, 32767]
    int [-2 147 483 648, 2 147 483 647]
    long [–9 223 372 036 854 775 808 , 9 223 372 036 854 775 807]
    float
    double
     */

    public static void main(String[] args) {

        byte b = 5;
        short sh = b;
        int i = sh;
        long l = i;
        float f = l;
        double d = f;
        System.out.println(d);

        short sh1 = 129;
        byte b1 = (byte) sh1;
        System.out.println(b1);


        int l1 = Integer.MAX_VALUE + 1;
        System.out.println(l1);

//        long l2 = 429496730L;
//        int i1 = (int) l2;
//        System.out.println(i1);

        String text = "Hello World";
        char[] chars = text.toCharArray();

        char ch2 = 'J';
        String text2 = String.valueOf(ch2);
        String text3 = new String(chars);

        String text4 = l1 + "";
        String text5 = String.valueOf(l1);

        double d1 = Double.parseDouble(text5);
        System.out.println(d1);
        double d2 = Double.valueOf(text4);
        System.out.println(d2);


    }


}
