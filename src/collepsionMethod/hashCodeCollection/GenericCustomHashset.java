package collepsionMethod.hashCodeCollection;

import java.util.HashSet;

public class GenericCustomHashset {

    public HashSet<EmployeeHashset> creategenericcustom(){

        HashSet<EmployeeHashset> employee =new HashSet<>();

        EmployeeHashset employee1 =new EmployeeHashset("paramvir", 2,"mechanical",2535.2);
        System.out.println("printing hashcose of employee1 "+ employee1.hashCode());
        EmployeeHashset employee2 =new EmployeeHashset("shailandra singh",3,"marketing",365.2);
        System.out.println("printing hashcode of empployee2"+employee2.hashCode());
        EmployeeHashset employee3 =new EmployeeHashset("alok", 5,"selling ",253.214);
        System.out.println("printing hashcode of employee3"+ employee3.hashCode());

        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);

        return employee;

    }
    public static void main(String[] args){
        GenericCustomHashset obj =new GenericCustomHashset();
        HashSet<EmployeeHashset> employee =obj.creategenericcustom();
        for( EmployeeHashset var: employee){
            System.out.println(var.getDepartment()+var.getName()+var.getSalary()+var.getEmploymentId());
        }
    }

}
