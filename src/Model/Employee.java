// Model class for getting employee details
package Model;

import java.util.Objects;

public class Employee {
    String Fname, Lname, Dept;
    int EmpId;

    // Param Constructor
    public Employee(String fname, String lname, String dept, int empId) {
        Fname = fname;
        Lname = lname;
        Dept = dept;
        EmpId = empId;
    }
    //Using override on Emp_Id in our custom class to remove redundant data of employees
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return EmpId == employee.EmpId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(EmpId);
    }

    //Getter & Setter for Employee
    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }
}
