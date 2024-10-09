package ua.com.kisit_course.groupe371.unit3;

import java.util.Arrays;
import java.util.Objects;

public class MyArrays {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int[] array2 = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int[] array3 = new int[3];
        array3[0] = 1;
        array3[1] = 2;
        array3[2] = 3;

        String[] names = new String[]{"Iva","Ivan","Ivanka"};

        Object[] array4 = new Object[3];
        array4[0] = "Ivan";
        array4[1] = 5;
        array4[2] = false;

        System.out.println(array4);
        System.out.println(Arrays.toString(array4));

        var array5 = new Object[3];
        array5[0] = "Ivan";
        array5[1] = "Iva";
        array5[2] = "Ivanka";

        for (int i = 0; i < array5.length; i++) {
            System.out.println(array5[i]);
        }

        int[][] array6 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] array7 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int[][] array8 = new int[3][3];
        array8[0][0] = 1;
        array8[0][1] = 2;
        array8[0][2] = 3;

        array8[1][0] = 4;
        array8[1][1] = 5;
        array8[1][2] = 6;

        array8[2][0] = 7;
        array8[2][1] = 8;
        array8[2][2] = 10;

        for (int i = 0; i < array8.length; i++) {
            for (int j = 0; j < array8[i].length; j++) {
                System.out.print(array8[i][j] + ",");
            }
            System.out.println();
        }


        for (int i = 0; i < array8.length; i++) {
            System.out.println(Arrays.toString(array8[i]));
        }

    }


}
