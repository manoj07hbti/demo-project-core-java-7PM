package modal;

import java.util.ArrayList;

public class Employee {

    String name;
    int employeecode;
    String department;

    public Employee(String name, int employeecode, String department) {
        this.name = name;
        this.employeecode = employeecode;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeecode() {
        return employeecode;
    }

    public void setEmployeecode(int employeecode) {
        this.employeecode = employeecode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
