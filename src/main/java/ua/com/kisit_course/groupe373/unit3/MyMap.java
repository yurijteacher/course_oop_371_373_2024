package ua.com.kisit_course.groupe373.unit3;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {

        Map<Integer, String> names = new HashMap<>();
        names.put(1, "KISIT");
        names.put(2, "KNEU");
        names.put(3, "KPI");

        System.out.println(names);

        System.out.println(names.get(3));

        names.put(1, "asd");
        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        for (Map.Entry<Integer, String> el : names.entrySet()) {
            System.out.println(el.getKey() + " " + el.getValue());
        }



    }
}
