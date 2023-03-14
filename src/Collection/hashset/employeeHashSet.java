package Collection.hashset;

import model.employee;
import model.student;

import java.util.HashSet;

public class employeeHashSet {
    public HashSet<employee> createEmployeeHashSet(){
        HashSet<employee> set = new HashSet();
        // create data of employee
        employee employee1 = new employee("Ashish", 55, "power engineer");
        employee employee2 = new employee("akash", 56, "civil engineer");
        employee employee3 = new employee("nitin", 57, "EC engineer");
        employee employee4 = new employee("shobek", 59, "patent engineer");
        employee employee5 = new employee("shobek", 59, "patent engineer");
        employee employee6 = new employee("nitin", 57, "EC engineer");

        // add data in set
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);
        set.add(employee6);
        System.out.println("Total number of employees in company : = " +set.size());

        return set;
    }

    public static void main(String[] args) {
        employeeHashSet obj = new employeeHashSet();
        HashSet<employee> set = obj.createEmployeeHashSet();
        for (employee var : set){
            System.out.println("printing employee : " +var.getName() + " ID number : " + var.getID_no());
        }
    }
}
