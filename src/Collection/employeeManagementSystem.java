package Collection;

import model.employee;

import java.util.ArrayList;

public class employeeManagementSystem {

    // creating employee array list
    public void createEmployeeArraylist(){
        // collectionName DataType = new collectionName
        ArrayList<employee> employeeArrayList= new ArrayList<>();

        // create employee
        employee employee1 = new employee("Ashish", 55, "power engineer");
        employee employee2 = new employee("akash", 56, "civil engineer");
        employee employee3 = new employee("nitin", 57, "EC engineer");
        employee employee4 = new employee("shobek", 59, "patent engineer");

        // adding employee in array list
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);

        for (employee var : employeeArrayList ){
            System.out.println("Printing employee : " +var.getName() + " at ID number : " +var.getID_no());
        }


    }

    public static void main(String[] args) {
        employeeManagementSystem obj = new employeeManagementSystem();
        obj.createEmployeeArraylist();
    }

}
