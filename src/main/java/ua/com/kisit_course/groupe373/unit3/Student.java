package ua.com.kisit_course.groupe373.unit3;

import java.util.Objects;

public class Student {

    private int id = 0;
    private String firstname = "Vasya";
    private String lastname = "Pypkin";
    private int age = 21;

    public Student() {
    }

    public Student(int id, String firstname, String lastname, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getAge() == student.getAge() && Objects.equals(getFirstname(), student.getFirstname()) && Objects.equals(getLastname(), student.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname(), getAge());
    }
}
