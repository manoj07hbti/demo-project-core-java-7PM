// Model class for getting employee details
package Model;

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
