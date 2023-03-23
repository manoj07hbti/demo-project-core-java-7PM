package collepsionMethod.hashCodeCollection;

import collepsionMethod.overrideHashset.EmployeeOverrideHashset;

import java.util.HashSet;

public class GenericCustomHashset {
    // java do not work properly when we use our method
    //Hashcode: this is integer value which is associate with every object but this is not remove duplicate element
    // two equal object will always have same hashcode
    // Remove this problem then we should have our hashcode, also we need to override hashcode(Also a method) and equals method
    // Equals is also a method which use of check equality
    // what is problem: enter element is same but store data is different how to remove such element

    public HashSet<EmployeeOverrideHashset> createoverridinghashset() {

        HashSet<EmployeeOverrideHashset> employee = new HashSet<>();

        EmployeeOverrideHashset employee1 = new EmployeeOverrideHashset("paramvir", 1, "mechanical");
        System.out.println("printing hashcode of employee1 " + employee1.hashCode());
        EmployeeOverrideHashset employee2 = new EmployeeOverrideHashset("shailandra singh", 2, "marketing");
        System.out.println("printing hashcode of employee2 " + employee2.hashCode());
        EmployeeOverrideHashset employee3 = new EmployeeOverrideHashset("alok", 3, "selling ");
        System.out.println("printing hashcode of employee3 " + employee3.hashCode());
        EmployeeOverrideHashset employee4 = new EmployeeOverrideHashset("arman", 3, "selling ");
        System.out.println("printing hashcode of employee4 " + employee4.hashCode());
        // when use override method of modal class then solve this problem

        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);
        employee.add(employee4);

        return employee;

    }

    public HashSet<EmployeeHashset> creategenericcustom() {
        HashSet<EmployeeHashset> Employee = new HashSet<>();
        EmployeeHashset employee1 = new EmployeeHashset("arman malik", 1, "doctor", 3250.01);
        System.out.println("printing hashcode of employee1 " + employee1.hashCode());
        EmployeeHashset employee2 = new EmployeeHashset("kamal", 2, "surgeon",3525.25 );
        System.out.println("printing hashcode of employee1 " + employee1.hashCode());
        Employee.add(employee1);
        Employee.add(employee2);

        return Employee;
    }

    public static void main(String[] args) {
        GenericCustomHashset obj = new GenericCustomHashset();
        HashSet<EmployeeOverrideHashset> override = new HashSet<>();
        for (EmployeeOverrideHashset var : override) {
            System.out.println(var.getDepartment() + var.getName() + var.getIdNo());
        }
        HashSet<EmployeeHashset> employee = obj.creategenericcustom();
        for (EmployeeHashset var : employee) {
            System.out.println(var.getDepartment() + var.getName() + var.getSalary() + var.getEmploymentId());

        }

    }
}
