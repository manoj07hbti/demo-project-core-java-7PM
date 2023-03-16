package collection.hashset;

import Model.Employee;

import java.util.HashSet;

public class DemoEmployeeHashSet {


    public HashSet<Employee> create() {

        HashSet<Employee> employeeHashSet = new HashSet<>();

        // create data of Employee

        Employee Employee1 = new Employee("Rahul", "pune", "IT");
        System.out.println("Printing hashcode of employee1 :" + Employee1.hashCode());

        Employee Employee2 = new Employee("Manoj", "Agra", "Engineering");
        System.out.println("Printing hashcode of employee2 :" + Employee2.hashCode());

        Employee Employee3 = new Employee("Mohit", "Delhi", "HR");
        System.out.println("Printing hashcode of employee3 :" + Employee3.hashCode());

        Employee Employee4 = new Employee("Rahul", "pune", "IT");
        System.out.println("Printing hashcode of employee4 :" + Employee4.hashCode());

        Employee Employee5 = new Employee("Manoj", "Agra", "Engineering");
        System.out.println("Printing hashcode of employee5 :" + Employee5.hashCode());


        // add data of set

        employeeHashSet.add(Employee1);
        employeeHashSet.add(Employee2);
        employeeHashSet.add(Employee3);
        employeeHashSet.add(Employee4);
        employeeHashSet.add(Employee5);

        return employeeHashSet;

    }

    public static void main(String args[]) {

        DemoEmployeeHashSet obj = new DemoEmployeeHashSet();

        HashSet<Employee> Employee = obj.create();

        for (Employee var : Employee) {

            System.out.println("Printing Employee :" + var.getName() + " address :" + var.getAddres() + " dept :" + var.getDept());
        }

    }
}
