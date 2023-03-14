package Model;

import java.util.Objects;

public class Student {

    String name;
    int RollNo;

    String Course;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return RollNo == student.RollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(RollNo);
    }

    public Student(String name, int rollNo, String course) {
        this.name = name;
        RollNo = rollNo;
        Course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }
}
