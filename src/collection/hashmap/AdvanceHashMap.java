package collection.hashmap;

import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class AdvanceHashMap {
    public void createMap(){
        HashMap<Integer, Employee> employeeHashMap=new HashMap<>();
        //Data Of Employee

        Employee employee1=new Employee("Mohan", 101,"Manager", 45000);
        Employee employee2=new Employee("Raj Kumar", 102, "cleark", 20000);
        Employee employee3=new Employee("Kalam",103,"Junior clerk", 18000);
        Employee employee4=new Employee("Rahul Khumar",104, "HR", 40000);
        Employee employee5=new Employee("Kalam",103,"Junior clerk", 18000);
        Employee employee6=new Employee("Rahul Khumar",104, "HR", 40000);

        employeeHashMap.put(1,employee1);
        employeeHashMap.put(2,employee2);
        employeeHashMap.put(3,employee3);
        employeeHashMap.put(4,employee4);
        employeeHashMap.put(5,employee5);
        employeeHashMap.put(6,employee6);


        for(Integer var :employeeHashMap.keySet()){
            System.out.println("Printing employee Map " +employeeHashMap.get(var).getEmpName() +employeeHashMap.get(var).getEmpId());
        }
    }
    public void createAdvanceMap(){
        HashMap<String, ArrayList<Employee>> stringArrayListHashMap=new HashMap<>() ;
        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        Employee employee1=new Employee("Mohan", 101,"Manager", 45000);
        Employee employee2=new Employee("Raj Kumar", 102, "cleark", 20000);
        Employee employee3=new Employee("Kalam",103,"Junior clerk", 18000);
        Employee employee4=new Employee("Rahul Khumar",104, "HR", 40000);

        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);

        stringArrayListHashMap.put("Agra COllege",employeeArrayList);
        System.out.println(stringArrayListHashMap.get("Agra College"));


    }

    public static void main(String[] args) {
        AdvanceHashMap obj=new AdvanceHashMap();
        obj.createMap();
        obj.createAdvanceMap();


    }
}
