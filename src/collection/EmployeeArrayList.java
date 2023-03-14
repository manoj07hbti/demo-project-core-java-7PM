package collection;

import modal.Employee;

import java.util.ArrayList;

public class EmployeeArrayList {

    public void createEmployeeList() {

        //Collection <DataType> objName = new Collection;

        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        //create data of employee

        Employee employee1 = new Employee("Raju", 4658.55, "Tundla");
        Employee employee2 = new Employee("Shiv", 5467.00, "Agra");
        Employee employee3 = new Employee("Ravi", 3577.66, "Pune");
        Employee employee4 = new Employee("Annu", 7676.55, "Mathura");

        //add data to list

        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);

        for (Employee var : employeeArrayList) {
            System.out.println("Printing Employee Data :" + var.getName() + "  Salary :" + var.getSalary() + "Location :" + var.getLocation());
        }

    }

    public static void main(String[] args) {

        EmployeeArrayList obj = new EmployeeArrayList();
        obj.createEmployeeList();

    }
}
