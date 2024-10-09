package ua.com.kisit_course.groupe372.unit6.association.many_to_many.v2;

import java.util.List;

public class Student {

    private List<StudentsHasTeachers> studentsHasTeachersList;

    public List<StudentsHasTeachers> getStudentsHasTeachersList() {
        return studentsHasTeachersList;
    }

    public void setStudentsHasTeachersList(List<StudentsHasTeachers> studentsHasTeachersList) {
        this.studentsHasTeachersList = studentsHasTeachersList;
    }

    private Long id;
    private String fullname;

    public Student() {
    }

    public Student(Long id, String fullname) {
        this.id = id;
        this.fullname = fullname;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
