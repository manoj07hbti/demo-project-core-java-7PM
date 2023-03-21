package collection;

import model.Employee;

import java.util.ArrayList;

public class EmployeeArrayList {

    public void createEmployeeList(){

        ArrayList <Employee> employeeArrayList = new ArrayList<>();

        Employee employee=new Employee("Raj",21,"It",43256.78);
        Employee employee1=new Employee("Lucky",22,"Cs",34256.45);
        Employee employee2=new Employee("amit Singh", 24,"Cs",65467.87);
        Employee employee3= new Employee("Rhoit Singh",26,"Ibm",785676.54);
        Employee employee4= new Employee("Rahul Singh",24,"SS",675854.45);


        employeeArrayList.add(employee);
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);

        for(Employee var : employeeArrayList){

            System.out.println("Printing Employee Name : "+var.getName() +" : Employee Age :"+var.getAge() +" :Employee Department : "+var.getDept() +" :Employee Salary : "+var.getSalary());

        }


    }

    public static void main(String[]args){

        EmployeeArrayList obj = new EmployeeArrayList();

        obj.createEmployeeList();
    }



}
