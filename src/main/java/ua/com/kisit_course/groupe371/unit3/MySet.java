package ua.com.kisit_course.groupe371.unit3;

import java.util.HashSet;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");

        System.out.println(names);
        names.add("John");
        System.out.println(names);

        names.remove("John");
        System.out.println(names);


        Student student1 =new Student(1, "Vasya", "Pypkin",18);
        Student student2 =new Student(2, "Iva", "Pypkina",22);
        Student student3 =new Student(3, "Ivanka", "Pypkina",21);
        Student student4 =new Student(4, "Inna", "Pyp",25);

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student1);

        System.out.println(students);

        Student student5 =new Student(5, "Vasya", "Pypkin",18);
        students.add(student5);

        System.out.println(students);



    }

}
