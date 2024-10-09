package ua.com.kisit_course.groupe372.unit3;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap();

        map.put(1, "Iva");
        map.put(2, "Michael");
        map.put(3, "Luis");
        System.out.println(map);

        System.out.println(map.get(1)); // Key -> Value
        System.out.println(map.get(2));
        System.out.println(map.get(3));

        map.put(1, "Ivanna");
        System.out.println(map);
        map.remove(2);
        System.out.println(map);

        for(Map.Entry<Integer, String> el : map.entrySet()) {
            System.out.println(el.getKey() + " " + el.getValue());
        }






    }
}
