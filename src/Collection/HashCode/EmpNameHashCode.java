package Collection.HashCode;

import Model.EmpName;
import Model.Employee;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmpNameHashCode {

    public LinkedHashSet<EmpName> Emp_Name(){

        LinkedHashSet<EmpName> data= new LinkedHashSet<>();

        EmpName emp1= new EmpName("Praveen", 1,"Dev");
        EmpName emp2= new EmpName("Ajeet", 2, "Dev");
        EmpName emp3= new EmpName("Anurag",3,"DBA");
        EmpName emp4= new EmpName("Anurag",4,"Testing");

        data.add(emp1);
        data.add(emp2);
        data.add(emp3);
        data.add(emp4);

        //Iterator<EmpName> itr=data.iterator();

        //while (itr.hasNext()){
           //System.out.println("Name : "+itr.next().getName());
        //}

        return data;
    }

    public static void main(String[] args) {
        EmpNameHashCode obj= new EmpNameHashCode();
        LinkedHashSet<EmpName> var1= obj.Emp_Name();
        for (EmpName var : var1){
            System.out.println("Name : "+var.getName()+" Emp_id : "+var.getEmp_id()+" Department : "+var.getDepartment());
        }
    }

}
