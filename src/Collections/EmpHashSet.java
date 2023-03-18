package Collections;

import Model.Employee;

import java.util.HashSet;

public class EmpHashSet {
    public HashSet<Employee> create() {
        HashSet<Employee> employeeHashSet=new HashSet<>();
        Employee employee1 = new Employee("Nadeesh", "Atre", "Admin", 01);
        Employee employee2 = new Employee("Nidheesh", "Atre", "IT", 02);
        Employee employee3 = new Employee("Aanchal", "Atre", "HR", 03);
        Employee employee4 = new Employee("Yogesh", "Atre", "OPS", 04);
        Employee employee5 = new Employee("Nideesh", "Atre", "Admin", 01);

        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee5);

        return employeeHashSet;
    }

    public static void main(String[] args) {
        EmpHashSet obj = new EmpHashSet();
        HashSet<Employee> employees= obj.create();
        System.out.println("List of Employees: ");
        for (Employee var: employees){
            System.out.println("Employee Id:->>"+var.getEmpId()+" Employee Name:->>"+var.getFname()+"->>"+var.getLname()+" Dept:->>"+var.getDept());
        }
    }
}
