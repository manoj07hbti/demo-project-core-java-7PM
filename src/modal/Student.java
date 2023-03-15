package modal;

public class Student {

    String Name;
    int Rollnumber;
    String Section;

    public Student(String name, int rollnumber, String section) {
        Name = name;
        Rollnumber = rollnumber;
        Section = section;
    }
    //getter & Setter

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRollnumber() {
        return Rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        Rollnumber = rollnumber;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }
}
