package ua.com.kisit_course.groupe372.unit3;

import java.util.HashSet;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");

        System.out.println(set);

        set.remove("2");
        System.out.println(set);
        set.add("2");

        System.out.println(set);

        set.clear();

        Student student1 = new Student(1, "Vasya", "Pypkin", 18);
        Student student2 = new Student(2, "Ivanka", "Pypkina", 19);
        Student student3 = new Student(3, "Iva", "Pypkina", 21);

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);

        Student student4 = new Student(4, "Vasya", "Pypkin", 18);
        students.add(student4);
        System.out.println(students);

    }


}
