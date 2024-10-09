package ua.com.kisit_course.groupe372.unit6.association.many_to_many.v2;

public class StudentsHasTeachers {

    private Student student;
    private Teacher teacher;
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public StudentsHasTeachers() {
    }

    public StudentsHasTeachers(Student student, Teacher teacher) {
        this.student = student;
        this.teacher = teacher;
    }

    public StudentsHasTeachers(Student student, Teacher teacher, String course) {
        this.student = student;
        this.teacher = teacher;
        this.course = course;
    }
}
