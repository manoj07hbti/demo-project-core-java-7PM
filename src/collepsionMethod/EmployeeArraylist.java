package collepsionMethod;

import java.util.ArrayList;
import java.util.*;

public class EmployeeArraylist {

    public void createEmployeeArrayList(){
        ArrayList <Employee> EmployeeArrayList = new ArrayList<>();

        Employee employee1 = new Employee("ram",123, "maintenance",25425.25);
        Employee employee2 =new Employee("hariom", 124, "quality", 25362.16);
        Employee employee3 = new Employee("paramvir", 125, "Engineer",20000);
        Employee employee4 = new Employee("harjeet", 126, "accountant ", 25000);

        EmployeeArrayList.add(employee1);
        EmployeeArrayList.add(employee2);
        EmployeeArrayList.add(employee3);
        EmployeeArrayList.add(employee4);

        for(Employee var : EmployeeArrayList){
            System.out.println("printing employee data "+var.getname( )+"Employment Id "+var.getEmploymentId( )+"Department is "+var.getDepartment( )+"salary is"+var.getSalary());
        }
    }

    public static void main(String [] args) {
        EmployeeArraylist obj = new EmployeeArraylist();
        obj.createEmployeeArrayList();
    }


}
