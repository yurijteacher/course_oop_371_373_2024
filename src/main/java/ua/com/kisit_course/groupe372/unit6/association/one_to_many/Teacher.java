package ua.com.kisit_course.groupe372.unit6.association.one_to_many;

import java.util.List;

public class Teacher {


    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private Long id;

    private String firstname;
    private String lastname;

    private String course;
    private String education;


    public Teacher() {}

    public Teacher(Long id, String firstname, String lastname, String course, String education) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.course = course;
        this.education = education;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", course='" + course + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
