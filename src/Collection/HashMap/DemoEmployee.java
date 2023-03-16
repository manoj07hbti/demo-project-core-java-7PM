package Collection.HashMap;

import Model.Employee;
import sun.management.ExtendedPlatformComponent;

import java.util.HashMap;
import java.util.Set;

public class DemoEmployee {

    public HashMap<Integer, Employee> create(){

        HashMap<Integer, Employee> data= new HashMap();

        Employee emp1= new Employee("Praveen",1,"Dev");
        Employee emp2= new Employee("Ajeet", 2, "Dev");
        Employee emp3= new Employee("Anurag",3,"DBA");

        data.put(1,emp1);
        data.put(2,emp2);
        data.put(2,emp3);


        Set<Integer> var=data.keySet();
        for(Integer var1 : var){
            System.out.println("Name : "+data.get(var1).getName()+" Emp_ID : "+data.get(var1).getEmp_id()+" Department : "+data.get(var1).getDepartment());
        }
        return  data;
    }

    public static void main(String[] args) {
        DemoEmployee obj= new DemoEmployee();
        obj.create();
    }
}
