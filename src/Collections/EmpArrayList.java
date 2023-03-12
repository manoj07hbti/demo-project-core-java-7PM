/* Program to print Employee List of array using Model class Data Types & Adv. Loop
   Program Name: EmpArrayList.java
   Program Date: 11-March-2023
   Program Auth: Aanchal Atre
*/
package Collections;

import Model.Employee;

import java.util.ArrayList;

public class EmpArrayList {

    public void createEmpArrayList(){
        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        // Now creating data for Employees
        Employee employee1=new Employee("Nadeesh", "Atre", "Admin", 01);
        Employee employee2=new Employee("Nidheesh", "Atre", "IT", 02);
        Employee employee3=new Employee("Aanchal", "Atre", "HR", 03);
        Employee employee4=new Employee("Yogesh", "Atre", "OPS", 04);

        //Now adding data to list
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);

        //Now print the list of employees
        System.out.println("\nPrinting Employee List:");
        for (Employee var:employeeArrayList){
            System.out.println("Name:-"+var.getFname()+" "+var.getLname()+"-->Dept:-"+var.getDept()+"-->Employee Id:-"+var.getEmpId());

        }
    }
    // Now creating the object of Employee Array List
    public static void main(String[] args) {
        EmpArrayList obj=new EmpArrayList();
        obj.createEmpArrayList();
    }
}
