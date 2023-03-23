package collepsionMethod.hashCodeCollection;

import java.util.HashSet;

public class EmployeDetailsHashSet {
    // HashSet remove duplicate data but when we use our datatype, or object like (other class), then it's not working properly
    // it's mean that this is not remove duplicate element

    public HashSet<EmployeeHashset> createStringSet(){

        HashSet<EmployeeHashset> Details = new HashSet<>();

        EmployeeHashset employee1= new EmployeeHashset("paramvir", 2536, "mechanical", 625.25);
        EmployeeHashset employee2= new EmployeeHashset("harjeet", 2536, "cs", 23520.1);
        EmployeeHashset employee3 = new EmployeeHashset("subham", 2536, "quality", 24568.21);
        EmployeeHashset employee4 = new EmployeeHashset("subham", 4, "maintenence", 2536.21);
        // employee 4 is a duplicate elements, so it's not remove by hashset

        Details.add(employee1);
        Details.add(employee2);
        Details.add(employee3);
        Details.add(employee4);
        return Details;
    }
    public static void main(String [] args){
        EmployeDetailsHashSet obj = new EmployeDetailsHashSet();
        HashSet<EmployeeHashset> employees=obj.createStringSet();
        for(EmployeeHashset var: employees){
            System.out.println("printing employee details "+var.getName()+var.getEmploymentId()+var.getDepartment()+var.getSalary());
        }



    }

}
