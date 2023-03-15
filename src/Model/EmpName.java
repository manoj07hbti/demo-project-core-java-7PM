package Model;

import java.util.Objects;

public class EmpName {

    String Name;
    int Emp_id;
    String Department;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpName empName = (EmpName) o;
        return Name.equals(empName.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name);
    }

    public EmpName(String name, int emp_id, String department) {
        Name = name;
        Emp_id = emp_id;
        Department = department;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
