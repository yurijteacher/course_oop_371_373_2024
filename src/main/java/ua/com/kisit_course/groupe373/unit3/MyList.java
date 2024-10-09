package ua.com.kisit_course.groupe373.unit3;

import ua.com.kisit_course.groupe371.unit3.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyList {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4);

        System.out.println(list);

        // list.add(5);
        // System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);
        list1.add(5);
        System.out.println(list1);


        list1.remove(0);
        System.out.println(list1);
        list1.set(0, 1);
        System.out.println(list1);

        list1.add(1, 2);
        System.out.println(list1);

        System.out.println(list1.get(1));

        list1.clear();
        System.out.println(list1);

        List<String> names = new ArrayList<>();
        names.add("Iva");
        names.add("Ivan");
        names.add("Ivanka");

        System.out.println(names);


        Student student1 = new Student(1, "Vasya", "Pypkin", 21);
        Student student2 = new Student(2, "Iva", "Pypkina", 18);
        Student student3 = new Student(3, "Ivan", "Pypkin", 22);
        Student student4 = new Student(4, "Ira", "Pypkina", 17);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);

        students
                .stream()
                .filter(el->el.getAge()<20)
                .forEach(el->System.out.println(el));

        List<Student> students1 =students
                .stream()
                .sorted(Comparator.comparing(Student::getAge)).toList();

        System.out.println(students1);

        Student student = students1
                .stream()
                .min(Comparator.comparing(Student::getAge))
                .get();

        System.out.println(student);

        double avg = students1.stream().collect(Collectors.averagingDouble(Student::getAge));
        int total = students1.stream().collect(Collectors.summingInt(Student::getAge));

        System.out.println((double) total/students1.size());
        System.out.println(avg);

        names.stream().map(e->"Hello," +e +"!").forEach(System.out::println);

        List<Integer> ages = students1
                .stream()
                .map(Student::getAge)
                .collect(Collectors.toList());
        System.out.println(ages);


        List<Integer> students2 = students1
                .parallelStream()
                .map(e->e.getAge()+1)
                .toList();

        System.out.println(students2);

    }
}
