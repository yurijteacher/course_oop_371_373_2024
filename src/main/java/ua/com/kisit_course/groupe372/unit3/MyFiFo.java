package ua.com.kisit_course.groupe372.unit3;

import java.util.LinkedList;
import java.util.Queue;

public class MyFiFo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue);

        // Залишаємо перший елемент у колекції
        int a = queue.peek();
        System.out.println(a + ":" + queue);

        int b = queue.poll();
        System.out.println(b + ":" + queue);

        int c = queue.poll();
        System.out.println(c + ":" + queue);


    }
}