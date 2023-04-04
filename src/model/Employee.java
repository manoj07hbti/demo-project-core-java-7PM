package model;

public class Employee {

    String EmpName;
    int EmpId;
    String EmpDestination;
    int EmpSalary;

    //parametrized constructor

    public Employee(String empName, int empId, String empDestination, int empSalary) {
        EmpName = empName;
        EmpId = empId;
        EmpDestination = empDestination;
        EmpSalary = empSalary;
    }
    //getter and setter
    public String getEmpName(){
        return EmpName;
    }
    public void setEmpName(String name){
        this.EmpName=EmpName;
    }
    public int getEmpId(){
        return EmpId;
    }
    public void setEmpId(int id){
        this.EmpId=EmpId;
    }
    public String getEmpDestination(){
        return EmpDestination;
    }
    public void setEmpDestination(String Destination){
        this.EmpDestination=EmpDestination;
    }
    public int getEmpSalary(){
        return EmpSalary;
    }
    public void setEmpSalary(int salary){
        this.EmpSalary=getEmpSalary();
    }
}
