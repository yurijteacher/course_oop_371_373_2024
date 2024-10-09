package ua.com.kisit_course.groupe373.unit3;

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

        array3[1] = 4;

        System.out.println(Arrays.toString(array3));
        Object[] array4 = new Object[3];
        array4[0] = 5;
        array4[1] = "Vasya";
        array4[2] = false;
        System.out.println(Arrays.toString(array4));

//        array4[3] = "asd";
//        System.out.println(Arrays.toString(array4));

        int[][] array5 = new int[3][3];
        int[][] array6 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};

        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                System.out.print(array6[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array6.length; i++) {
            System.out.println(Arrays.toString(array6[i]));
        }

        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                array5[i][j]= i + j;
            }
        }


        for (int i = 0; i < array5.length; i++) {
            System.out.println(Arrays.toString(array5[i]));
        }

        int[][][] dsf = new int[3][3][3];



    }

}
