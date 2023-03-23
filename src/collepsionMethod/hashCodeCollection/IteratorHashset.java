package collepsionMethod.hashCodeCollection;

import Method_obje.Employee;
import java.util.*;

public class IteratorHashset {
    public HashSet<EmployeeHashset> DemoIterator() {

        HashSet<EmployeeHashset> iterator = new HashSet<>();

        EmployeeHashset employee1 = new EmployeeHashset("salman", 2, "socail networking", 253.21);
        EmployeeHashset employee2 = new EmployeeHashset("neeraj", 3, "engineer", 253.1);
        iterator.add(employee1);
        iterator.add(employee2);

        Iterator <EmployeeHashset> itr =iterator.iterator();
        while(itr.hasNext()){
            System.out.println("printing it"+itr.next().getName());
        }

        return iterator;

    }
    public static void main(String [] args){
        IteratorHashset obj =new IteratorHashset();
        HashSet<EmployeeHashset> m =obj.DemoIterator();
        for (EmployeeHashset var: m){
            System.out.println("printing name:_"+var.getName()+" "+"Departments name:_"+var.getDepartment()+" "+"employment id is:_"+var.getEmploymentId()+" "+"salary is _"+var.getSalary());
        }

    }

}
