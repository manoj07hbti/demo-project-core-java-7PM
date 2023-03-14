package Model;

public class Student {

    String name;
    int RollNo;

    String Course;

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
