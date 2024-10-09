package ua.com.kisit_course.groupe371.unit3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyList {

    public static void main(String[] args) {

        List<String> list = List.of("Iva", "Ivanka","Ivan");
        System.out.println(list);

//        list.add("SDf");
//        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.add("Ivan");
        list2.add("Ivanka");
        list2.add("Iva");

        System.out.println(list2);
        list2.add("Iva");
        System.out.println(list2);

        list2.set(3, "Ira");
        System.out.println(list2);
        list2.remove(2);
        System.out.println(list2);
        list2.add(0, "Vasya");
        System.out.println(list2);
        list2.clear();

        System.out.println(list2);


        Student student1 =new Student(1, "Vasya", "Pypkin",18);
        Student student2 =new Student(2, "Iva", "Pypkina",22);
        Student student3 =new Student(3, "Ivanka", "Pypkina",21);
        Student student4 =new Student(4, "Inna", "Pyp",25);


        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student1);

        Student student5 =new Student(5, "Ira", "Pypi",26);

        students.set(4, student5);

        System.out.println(students);

        students.remove(student5);


        System.out.println(students);
        students.remove(3);


        students
                .stream()
                .forEach(el->System.out.println(el));

        students
                .stream()
                .forEach(System.out::println);


        for (Student student : students) {
            System.out.println(student);
        }


        System.out.println(students);

        students
                .stream()
                .filter(e->e.getAge()<20)
                .forEach(System.out::println);

        students.
                stream()
                .sorted(Comparator.comparing(Student::getAge))
                .toList()
                .forEach(System.out::println);


        int min =  students.stream()
                .min(Comparator.comparing(Student::getAge))
                .get()
                .getAge();

        System.out.println(min);

        Student  student6 =  students.stream()
                .min(Comparator.comparing(Student::getAge))
                .get();

        System.out.println("min:"  + student6);

        students
                .stream()
                .filter(e->e.getAge()<20)
                .forEach(System.out::println);

        int max =  students.stream().max(Comparator.comparing(Student::getAge)).get().getAge();
        System.out.println(max);

        double average = students.stream().collect(Collectors.averagingDouble(Student::getAge)).doubleValue();
        System.out.println(average);

        List<String> hello = students
                .stream()
                .map(e->"Hello, " + e.getFirstname() + " " + e.getLastname()+"!").toList();

        System.out.println(hello);

    }



}
