package collection.Hashset;

import model.Employee;

import java.util.HashSet;

public class EmployeeHashset_Assign13March {
    public HashSet<Employee> Employee(){
        HashSet<Employee>employeeHashSet=new HashSet<>();
        //create data of employee

        Employee employee1=new Employee("Mohan", 101,"Manager", 45000);
        Employee employee2=new Employee("Raj Kumar", 102, "cleark", 20000);
        Employee employee3=new Employee("Kalam",103,"Junior clerk", 18000);
        Employee employee4=new Employee("Rahul Khumar",104, "HR", 40000);
        Employee employee5=new Employee("Kalam",103,"Junior clerk", 18000);
        Employee employee6=new Employee("Rahul Khumar",104, "HR", 40000);


        //add data to set

        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee5);
        employeeHashSet.add(employee6);
        return employeeHashSet;
    }

    public static void main(String[] args) {
        EmployeeHashset_Assign13March obj=new EmployeeHashset_Assign13March();
        HashSet<Employee> employee=obj.Employee();
        for(Employee var:employee){
            System.out.println("printing employee date in model class with Hashset "+var.getEmpName()+ "Emp Salr "+var.getEmpSalary()+ "Employe Destination"+var.getEmpDestination());
        }
    }
}
