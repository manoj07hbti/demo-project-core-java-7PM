package model;

import java.util.Objects;

public class Student {
    String name;
    int roll_no;
    String course;

    String college_name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll_no == student.roll_no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll_no);
    }

    public Student(String name, int roll_no, String course,String college_name) {
        this.name = name;
        this.roll_no = roll_no;
        this.course = course;
        this.college_name = college_name;
    }

    public Student(String name, int roll_no, String course) {
        this.name = name;
        this.roll_no = roll_no;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }
}
