package collection;

import Model.Employee;

import java.util.ArrayList;

public class EmployeeArrayList {

     public static void main(String args[]){

        EmployeeArrayList obj = new EmployeeArrayList();
         obj.createEmployeeArrayList();

     }

    public void createEmployeeArrayList(){

        // Collection <DataType> objName = new Collection();

        ArrayList <Employee> EmployeeArrayList = new ArrayList<>();

        // create data of Employee

         Employee Employee1 = new Employee("Rahul","pune","IT");
         Employee Employee2 =new Employee("Manoj","Agra","Engineering");
         Employee  Employee3 =new Employee("Mohit","Delhi","HR");

         //  Add Data ot list

         EmployeeArrayList.add(Employee1);
         EmployeeArrayList.add(Employee2);
         EmployeeArrayList.add(Employee3);

         for(Employee var : EmployeeArrayList){

             System.out.println("Printing Employee Data :"+ var.getName() + "Address :"  +  var.getAddres()  + "dept :" + var.getDept());
         }



    }










}
