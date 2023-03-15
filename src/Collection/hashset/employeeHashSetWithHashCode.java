package Collection.hashset;

import model.employee;

import java.util.HashSet;

public class employeeHashSetWithHashCode {
    public HashSet<employee> createEmployeeHashSet(){
        HashSet<employee> set = new HashSet();
        // create data of employee
        employee employee1 = new employee("Ashish", 55, "power engineer");
        System.out.println("Printing hashcode of employee1 : " +employee1.hashCode());

        employee employee2 = new employee("akash", 56, "civil engineer");
        System.out.println("Printing hashcode of employee2 : " +employee2.hashCode());

        employee employee3 = new employee("nitin", 57, "EC engineer");
        System.out.println("Printing hashcode of employee3 : " +employee3.hashCode());

        employee employee4 = new employee("shobek", 59, "patent engineer");
        System.out.println("Printing hashcode of employee4 : " +employee4.hashCode());

        employee employee5 = new employee("shobek das", 59, "patent engineer");
        System.out.println("Printing hashcode of employee5 : " +employee5.hashCode());

        employee employee6 = new employee("nitin singh ", 57, "EC engineer");
        System.out.println("Printing hashcode of employee6 : " +employee6.hashCode());


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
        employeeHashSetWithHashCode obj = new employeeHashSetWithHashCode();
        HashSet<employee> set = obj.createEmployeeHashSet();
        for (employee var : set){
            System.out.println("printing employee : " +var.getName() + " ID number : " + var.getID_no());
        }
    }
}
