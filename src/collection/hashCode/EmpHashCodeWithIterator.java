package collection.hashCode;


import model.Employee;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmpHashCodeWithIterator {

    public LinkedHashSet<Employee> create(){

        LinkedHashSet<Employee> data= new LinkedHashSet<>();

        Employee emp1= new Employee("Praveen", 1, "DEV");
        Employee emp2= new Employee("Ajeet",2,"Dev");
        Employee emp3= new Employee("Anurag",3,"DBA");

        data.add(emp1);
        data.add(emp2);
        data.add(emp3);

        Iterator<Employee> itr=data.iterator();

        while(itr.hasNext()){
            Employee e1= itr.next();
            System.out.println("Name : "+e1.getName()+" Emp_Id : "+e1.getEmp_id()+" Department : "+e1.getDepartment());
        }

        return data;
    }

    public static void main(String[] args) {
        EmpHashCodeWithIterator obj= new EmpHashCodeWithIterator();
        LinkedHashSet<Employee> var=obj.create();
        //for(Employee var1 : var){
        //    System.out.println("Name : "+var1.getName()+" Emp_Id : "+var1.getEmp_id()+" Department : "+var1.getDepartment());
        //}
    }
}
