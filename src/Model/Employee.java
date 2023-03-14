package Model;

public class Employee {

    String name;
    String addres;
     String dept;

     // param constructor


    public Employee(String name, String addres, String dept) {
        this.name = name;
        this.addres = addres;
        this.dept = dept;
    }

    // getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }










}
