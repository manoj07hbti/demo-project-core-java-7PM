package collection.hashset;

import modal.Employee;

import java.util.HashSet;

public class DemoEmployeeHashSet {

    public HashSet<Employee> createEmployee() {

        HashSet<Employee> employeeHashSet = new HashSet<>();

        // create data of employee with hashcode

        Employee employee1 = new Employee("Raju", 4658.55, "Tundla");
        System.out.println("Printing hashcode of employee1 :" + employee1.hashCode());

        Employee employee2 = new Employee("Shiv", 5467.00, "Agra");
        System.out.println("Printing hashcode of employee2 :" + employee2.hashCode());

        Employee employee3 = new Employee("Ravi", 3577.66, "Pune");
        System.out.println("Printing hashcode of employee3 :" + employee3.hashCode());

        Employee employee4 = new Employee("Annu", 7676.55, "Mathura");
        System.out.println("Printing hashcode of employee4 :" + employee4.hashCode());

        Employee employee5 = new Employee("Raju", 4658.55, "Tundla");
        System.out.println("Printing hashcode of employee5 :" + employee5.hashCode());

        Employee employee6 = new Employee("Shiv", 5467.00, "Agra");
        System.out.println("Printing hashcode of employee6 :" + employee6.hashCode());

        Employee employee7 = new Employee("Ravi", 3577.66, "Pune");
        System.out.println("Printing hashcode of employee7 :" + employee7.hashCode());

        Employee employee8 = new Employee("Annu", 7676.55, "Mathura");
        System.out.println("Printing hashcode of employee8 :" + employee8.hashCode());

        // add data to HashSet

        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee5);
        employeeHashSet.add(employee6);
        employeeHashSet.add(employee7);
        employeeHashSet.add(employee8);

        System.out.println("Size of employee is :" + employeeHashSet.size());

        return employeeHashSet;

    }

    public static void main(String[] args) {

        DemoEmployeeHashSet obj = new DemoEmployeeHashSet();
        HashSet<Employee> employee = obj.createEmployee();

        //Advanced for loop printing all employee data hashSet by override hashcode and equals

        for (Employee var : employee) {
            System.out.println("Printing employee :" + var.getName() + "  Salary :" + var.getSalary() + "  Location :" + var.getLocation());
        }

    }
}
