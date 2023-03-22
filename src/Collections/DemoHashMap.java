//Program to print the list of employees using Arraylist from Employee Model Class using HashMap..

package Collections;

import Model.Employee;
import javafx.scene.effect.SepiaTone;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {
    public HashMap<String, ArrayList<Employee>> create() {
        HashMap<String, ArrayList<Employee>> empMap = new HashMap<>();
        ArrayList<Employee> hpEmp = new ArrayList<>();
        ArrayList<Employee> dellEmp = new ArrayList<>();

        Employee employee1 = new Employee("Nadeesh", "Atre", "Admin", 01);
        Employee employee2 = new Employee("Nidheesh", "Atre", "IT", 02);
        Employee employee3 = new Employee("Aanchal", "Atre", "HR", 03);
        Employee employee4 = new Employee("Yogesh", "Atre", "OPS", 04);

        hpEmp.add(employee1);
        hpEmp.add(employee3);
        dellEmp.add(employee2);
        dellEmp.add(employee4);

        empMap.put("HP Emp", hpEmp);
        empMap.put("Dell Emp", dellEmp);

        Set<String> keys = empMap.keySet();
        System.out.println("List of Employees: ");
        for (String key: keys){
            ArrayList<Employee> list=empMap.get(key);

            for (int i = 0; i < list.size(); i++)
                System.out.println(list.get(i).getFname() + " " + list.get(i).getLname() + "<-->" + list.get(i).getDept() + "<-->" + list.get(i).getEmpId());
        }
        return empMap;
    }
        public static void main (String[]args){
            DemoHashMap obj = new DemoHashMap();
            obj.create();
        }

}
