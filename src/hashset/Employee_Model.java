package hashset;

import model.Employee;

import java.util.HashSet;

public class Employee_Model {

    public void demo(){
        HashSet<Employee> emp= new HashSet<>();
        Employee dr= new Employee("Arman Khan",12343,11223344,50000.00);
        Employee dr1= new Employee("Imran Khan",13353,22334455,60000.00);
        Employee dr2= new Employee("Manoj Khan",14363,33445566,70000.00);
        Employee dr3= new Employee("Raman Khan",15373,4356789,80000.00);

        emp.add(dr);
        emp.add(dr1);
        emp.add(dr2);
        emp.add(dr3);

        for(Employee obj : emp){
            System.out.println(obj.getName());
            System.out.println(obj.getId());
            System.out.println(obj.getSr_num());
            System.out.println(obj.getSalary());
        }




    }

    public static void main(String[] args) {
        Employee_Model obj = new Employee_Model();
        obj.demo();
    }
}
