package ua.com.kisit_course.groupe372.unit6.association.many_to_many.v2;

import java.util.List;

public class Teacher {

    private List<StudentsHasTeachers> studentsHasTeachersLists;

    public List<StudentsHasTeachers> getStudentsHasTeachersLists() {
        return studentsHasTeachersLists;
    }

    public void setStudentsHasTeachersLists(List<StudentsHasTeachers> studentsHasTeachersLists) {
        this.studentsHasTeachersLists = studentsHasTeachersLists;
    }

    private Long id;
    private String firstname;
    private String lastname;
    private String email;

    public Teacher() {}

    public Teacher(Long id, String firstname, String lastname, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
