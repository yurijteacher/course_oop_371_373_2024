package ua.com.kisit_course.groupe371.unit3;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
            map.put(1, "Iva");
            map.put(2, "Michael");
            map.put(3, "Luis");

        System.out.println(map);

        map.remove(1);
        map.put(4, "Sad");
        System.out.println(map.get(1));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



    }
}
