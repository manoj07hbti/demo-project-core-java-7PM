package model;

import java.util.Objects;

public class employee {
    String name;
    int ID_no;
    String designation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employee employee = (employee) o;
        return ID_no == employee.ID_no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_no);
    }

    public employee(String name, int ID_no, String designation) {
        this.name = name;
        this.ID_no = ID_no;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID_no() {
        return ID_no;
    }

    public void setID_no(int ID_no) {
        this.ID_no = ID_no;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
