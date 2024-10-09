package ua.com.kisit_course.groupe372.unit3;

import java.util.Arrays;

public class MyArrays {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[3];
        arr3[0] = 1;
        arr3[1] = 2;
        arr3[2] = 3;
      //  arr3[3] = 4;

        System.out.println(Arrays.toString(arr3));

        arr3[0] = 3;
        arr3[1] = 2;
        arr3[2] = 1;
        System.out.println(Arrays.toString(arr3));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }

        int[][] array1 = new int[][]{
                {1,2,3},
                {4,5,6}
        };

        int[][] array2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j]+",");
            }
            System.out.println();
        }


        for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]));
        }


        int[] array3 = {1,2,3,4,5};
        int[] array4 = {6,7,8,9,10};

//        int[] array5 = new int[]{Arrays.mismatch(array3, array4)};
//        System.out.println(Arrays.toString(array5));


    }
}
