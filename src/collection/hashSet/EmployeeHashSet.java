package collection.hashSet;

import model.Employee;

import java.util.LinkedHashSet;

public class EmployeeHashSet {

    public LinkedHashSet<Employee> EmployeeData(){

        LinkedHashSet<Employee> data= new LinkedHashSet();

        Employee emp1= new Employee("Praveen", 1, "Dev");
        Employee emp2= new Employee("Ajeet", 2, "Dev");
        Employee emp3= new Employee("Anurag", 3, "DBA");
        Employee emp4= new Employee("Ankit", 3, "Testing");

        data.add(emp1);
        data.add(emp2);
        data.add(emp3);
        data.add(emp4);

        return data;
    }

    public static void main(String[] args) {
        EmployeeHashSet obj= new EmployeeHashSet();
        LinkedHashSet<Employee> var= obj.EmployeeData();

        for (Employee var1 : var){
            System.out.println("Name : "+var1.getName()+" Emp_ID : "+var1.getEmp_id()+" Department : "+var1.getDepartment());
        }
    }

}
