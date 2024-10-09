package ua.com.kisit_course.example.jvm.jvm9;

import java.util.*;

public class MyList {

    public static void main(String[] args) {

        // JDK 8
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        // JDK 9
        List<String> list1 = List.of("1","2","3");
        Set<String> set = Set.of("String");
        Map<String, Integer> map = Map.of("String1", 1, "String2", 2);

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,3,4};

        System.out.println(Arrays.mismatch(arr1, arr2));

        // JDK 11
        Map<String, String> map1 = new HashMap<>();
        var map2 = new HashMap<>();
        var number = 5;

        var str = "\t \n Hello World \nHello World!";

        System.out.println(str.isBlank());
        System.out.println(str.repeat(3));
        System.out.println(str.lines().toList());
        System.out.println(str.strip()); // прибираэ пробіли чи символи на початку і кінець

    }
}
