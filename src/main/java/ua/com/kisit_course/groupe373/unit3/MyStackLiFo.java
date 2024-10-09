package ua.com.kisit_course.groupe373.unit3;

import java.util.Stack;

public class MyStackLiFo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        int a = stack.pop();
        System.out.println(a + " " + stack);

        int b = stack.pop();
        System.out.println(b + " " + stack);

        int c = stack.peek();
        System.out.println(c + " " + stack);

    }
}
