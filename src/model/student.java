package model;

public class student {
    String name;
    int roll_no;
    String section;

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
