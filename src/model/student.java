package model;

import java.util.Objects;

public class student {
    String name;
    int roll_no;
    String section;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return roll_no == student.roll_no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll_no);
    }

    // parameterized constructor
    public student(String name, int roll_no, String section) {
        this.name = name;
        this.roll_no = roll_no;
        this.section = section;
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

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
