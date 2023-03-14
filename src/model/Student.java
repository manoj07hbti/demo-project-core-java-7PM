package model;

public class Student {
    String name;
    int rollno;
    String section;

    //parametrized constructor

    public Student(String name, int rollno, String section) {

        this.name = name;
        this.rollno = rollno;
        this.section = section;
    }


    // getter and setter

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getRollno(){
        return rollno;
    }
    public void setRollno(){
        this.rollno=rollno;
    }
    public String getSection(){
        return section;
    }
    public void setSection(){
        this.section=section;
    }


}
