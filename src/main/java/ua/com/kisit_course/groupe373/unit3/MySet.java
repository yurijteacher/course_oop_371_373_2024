package ua.com.kisit_course.groupe373.unit3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MySet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("1");

        Set<Student> students = new HashSet<>();

        System.out.println(set);

        Student student1 = new Student(1, "Vasya", "Pypkin", 21);
        Student student2 = new Student(2, "Iva", "Pypkina", 18);
        Student student3 = new Student(3, "Ivan", "Pypkin", 22);
        Student student4 = new Student(4, "Ira", "Pypkina", 17);


        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student1);

        System.out.println(students);

        Student student5 = new Student(5, "Vasya", "Pypkin", 21);

        students.add(student5);
        System.out.println(students);

         students
                 .stream()
                 .toList()
                 .stream()
                 .sorted(Comparator.comparing(Student::getAge))
                 .toList()
                 .forEach(System.out::println);

         students.remove(student4);
        System.out.println(students);


    }
}
