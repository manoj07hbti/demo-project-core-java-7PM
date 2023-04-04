package collection.List;

import model.Employee;

import java.util.ArrayList;

public class EmployeeArrayList_Assign11march {
    public void createArrayList(){
        // Collection <Datatype> objName= new Collection();
        ArrayList < Employee> EmpArray =new ArrayList<>();

        //create data of Employee
        Employee employee1=new Employee("Mohan", 101,"Manager", 45000);
        Employee employee2=new Employee("Raj Kumar", 102, "cleark", 20000);
        Employee employee3=new Employee("Kalam",103,"Junior clerk", 18000);
        Employee employee4=new Employee("Rahul Khumar",104, "HR", 40000);

        //add employee data
        EmpArray.add(employee1);
        EmpArray.add(employee2);
        EmpArray.add(employee3);
        EmpArray.add(employee4);

        for(Employee var:EmpArray){
            System.out.println("Print Employee Data " + var.getEmpName() + " Emp Id " +var.getEmpId() + "Emp Destination "+var.getEmpDestination() + "Emp Salary " + var.getEmpSalary());
        }

    }

    public static void main(String[] args) {
        EmployeeArrayList_Assign11march obj=new EmployeeArrayList_Assign11march();
        obj.createArrayList();

    }

}
