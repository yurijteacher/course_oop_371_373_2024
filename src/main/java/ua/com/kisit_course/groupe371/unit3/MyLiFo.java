package ua.com.kisit_course.groupe371.unit3;

import java.util.Stack;

public class MyLiFo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int a = stack.peek();
        System.out.println(a + " " + stack);

        int b= stack.pop();
        System.out.println(b + " " + stack);

    }


}
