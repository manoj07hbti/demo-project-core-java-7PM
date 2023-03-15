package collepsionMethod;

public class Employee {

    String name;
    int EmploymentId;
    String Department;
    double salary;
    public Employee(String name, int EmploymentId, String Department, double salary) {

        this.name = name;
        this.EmploymentId = EmploymentId;
        this.Department = Department;
        this.salary= salary;
    }
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
