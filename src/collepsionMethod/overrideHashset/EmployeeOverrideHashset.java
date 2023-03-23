package collepsionMethod.overrideHashset;

import java.util.Objects;

public class EmployeeOverrideHashset {
    // what is problem: enter element is same but store data is different how to remove such element
    // Remove this problem then we should have our hashcode, also we need to override hashcode(Also a method) and equals method
   String name;
   int idNo;
   String department;
    // override hashcode and equals method then check equal data to roll no


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeOverrideHashset that = (EmployeeOverrideHashset) o;
        return idNo == that.idNo && name.equals(that.name) && department.equals(that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, idNo, department);
    }

    public EmployeeOverrideHashset(String name, int idNo, String department) {
        this.name = name;
        this.idNo = idNo;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    /* 1- Employee hashSet
2- override hashcode/equals for empId
3- override hashcode /equals for Name
4- override hashcode/equals for all properties*/
    // Second Assignment 
    /*Q:  Find the last element of ArrayList ?


    list.size();   5 = 0,1,2,3,4
    list.get(list.size()-1);

Q find the second element

   list.get(1);

Q  StudentArrayList : we need to find out IT section Student


   for (int i=0; i< list.size(); i++){

        if(list.get(i).getSection().eqauls("IT")){
                SOUT();
           }
   }*/
}
