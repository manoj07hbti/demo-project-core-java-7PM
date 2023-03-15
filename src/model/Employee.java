package model;

public class Employee {

    String name;
    int id;
    double sr_num;
    double salary;

    public Employee(String name, int id, double sr_num, double salary) {
        this.name = name;
        this.id = id;
        this.sr_num = sr_num;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSr_num() {
        return sr_num;
    }

    public void setSr_num(double sr_num) {
        this.sr_num = sr_num;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}



