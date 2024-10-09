package ua.com.kisit_course.groupe372.unit6.association.many_to_many.v1;

import java.util.List;

public class Student {

    private List<Teacher> teachers;

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    private Long id;
    private String fullname;
    private int age;

    public Student() {
    }

    public Student(Long id, String fullname, int age) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                '}';
    }
}
