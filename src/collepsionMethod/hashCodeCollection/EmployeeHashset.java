package collepsionMethod.hashCodeCollection;


public class EmployeeHashset {

    String name;
    int employmentId;
    String Department;
    double salary;

    public EmployeeHashset(String name, int employmentId, String department, double salary) {
        this.name = name;
        this.employmentId = employmentId;
        Department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmploymentId() {
        return employmentId;
    }

    public void setEmploymentId(int employmentId) {
        this.employmentId = employmentId;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



}



//reate 3 HashSet

       // 1- String, 2-Integer 3-Double

        //4- Employee HashSet