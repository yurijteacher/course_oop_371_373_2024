package ua.com.kisit_course.groupe372.unit3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyList {

    public static void main(String[] args) {

        List<String> list = List.of("Hello", "From", "World");
//        list.add("In");
        System.out.println(list);


        List<String> names = new ArrayList<>() {};

        names.add("Ivan");
        names.add("Ivanka");
        names.add("Iva");

        System.out.println(names);
        names.add("Ira");
        System.out.println(names);

        names.add(0, "Sava");
        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        names.set(0, "Ivan");
        System.out.println(names);

        names.clear();
        System.out.println(names);

        List<Student> students = new ArrayList<>();

        Student student1 = new Student(1, "Vasya", "Pypkin", 18);
        Student student2 = new Student(2, "Ivanka", "Pypkina", 19);
        Student student3 = new Student(3, "Iva", "Pypkina", 21);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);

        Student student4 = new Student(1, "Vasya", "Pypkin", 18);
        students.add(student4);

        student4.setId(4);
        student4.setFirstname("Ivan");
        student4.setLastname("Shev");
        student4.setAge(21);

        students.set(3, student4);

        System.out.println(students);

        // Stream JDK 8

        students
                .stream()
                .forEach(el-> System.out.println(el));

        students
                .stream()
                .forEach(System.out::println);

        students
                .stream()
                .filter(e->e.getAge()<20)
                .forEach(System.out::println);

        for (Student student : students) {
            if(student.getAge()<20) System.out.println(student);
        }


        List<Student> studentsSortedByAge =  students
                .stream()
                .sorted(Comparator.comparing(Student::getAge))
//                .collect(Collectors.toList());  // JDK 8
                .toList();  // JDK 17

        System.out.println(studentsSortedByAge);

        int min = studentsSortedByAge
                .stream()
                .min(Comparator.comparing(Student::getAge))
                .get().getAge();

        System.out.println(min);

        Student student = studentsSortedByAge
                .stream()
                .min(Comparator.comparing(Student::getAge))
                .get();

        System.out.println(student);

        double avrAge= studentsSortedByAge
                .stream()
                .collect(Collectors.averagingDouble(Student::getAge));
        System.out.println(avrAge);

        for (Student st : students){
            System.out.println(st);
        }

        List<String> names1 = new ArrayList<>();
        names1.add("Iva");
        names1.add("Ivan");
        names1.add("Ivanka");

        List<String> names2 = names1
                .stream()
                .map(e-> "Hello,"+e+"!")
                .toList();

        System.out.println(names2);


        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<String> hello = numbers
                .stream()
                .map(e-> e + " hello")
                .toList();
        System.out.println(hello);

    }


}
