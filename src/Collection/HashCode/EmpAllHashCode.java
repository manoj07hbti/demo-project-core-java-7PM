package Collection.HashCode;

import Model.EmpALLProperties;
import Model.Employee;

import java.util.LinkedHashSet;

public class EmpAllHashCode {

    public LinkedHashSet<EmpALLProperties> AllProperties(){

        LinkedHashSet<EmpALLProperties> data= new LinkedHashSet<>();

        EmpALLProperties emp1= new EmpALLProperties("Praveen",1, "Dev");
        EmpALLProperties emp2= new EmpALLProperties("Ajeet", 2, "Dev");
        EmpALLProperties emp3= new EmpALLProperties("Anurag", 3, "DBA");
        EmpALLProperties emp4= new EmpALLProperties("Anurag",3,"DBA");

        data.add(emp1);
        data.add(emp2);
        data.add(emp3);
        data.add(emp4);

        return data;
    }

    public static void main(String[] args) {
        EmpAllHashCode obj= new EmpAllHashCode();
        LinkedHashSet<EmpALLProperties> var1= obj.AllProperties();
        for (EmpALLProperties var : var1){
            System.out.println("Name : "+var.getName()+" Emp_Id : "+var.getEmp_id()+" Department : "+var.getDepartment());
        }
    }
}
