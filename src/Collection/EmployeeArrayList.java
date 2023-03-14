package Collection;

import java.util.ArrayList;
import Model.Employee;

public class EmployeeArrayList {

    public void CreateEmployeeArrayList(){

        ArrayList<Employee> EmployeeList= new ArrayList();

        Employee Employee1= new Employee("Praveen", 1, "Dev");
        Employee Employee2= new Employee("Ajeet", 2,"IT");
        Employee Employee3= new Employee("Ankit", 3, "Testing");

        EmployeeList.add(Employee1);
        EmployeeList.add(Employee2);
        EmployeeList.add(Employee3);

        for(Employee var : EmployeeList) {
            System.out.println("Employee Name : " +var.getName()+" Employee Id : "+var.getEmp_id()+" Employee Department : "+var.getDepartment());
        }
    }

    public static void main(String[] args) {

        EmployeeArrayList list = new EmployeeArrayList();
        list.CreateEmployeeArrayList();
    }
}
