package model;

import java.util.Objects;

public class StringHashCodeDemo {

    String Name, Department, Qualification;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringHashCodeDemo that = (StringHashCodeDemo) o;
        return Name.equals(that.Name) && Department.equals(that.Department) && Qualification.equals(that.Qualification);
    }


    @Override
    public int hashCode() {
        return Objects.hash(Name, Department, Qualification);
    }

    public StringHashCodeDemo(String name, String department, String qualification) {
        Name = name;
        Department = department;
        Qualification = qualification;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }
}
