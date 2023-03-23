package collepsionMethod.arrayList;

public class Employee {
    // first of all we can declare datatype 

    String name;
    int EmploymentId;
    String Department;
    double salary;
    // we make parameter construction like as : right click+Generate+ Constructor + select
    public Employee(String name, int EmploymentId, String Department, double salary) {

        this.name = name;
        this.EmploymentId = EmploymentId;
        this.Department = Department;
        this.salary= salary;
    }
    // we can make getter and setter click right key + getter and setter
        public String getname(){
        return name;
    }
    public void SetName(String name){
        this.name=name;
    }
    public int getEmploymentId(){
        return EmploymentId;
    }
    public void SetEmploymentId(){
        this.EmploymentId=EmploymentId;
    }
    public String getDepartment(){
        return Department;
    }
    public void SetDepartment(){
        this.Department=Department;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary = salary;
    }


}
