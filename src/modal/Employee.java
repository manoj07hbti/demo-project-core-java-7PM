package modal;

import java.util.Objects;

public class Employee {

    String name;
    double salary;
    String location;

    //override hashcode and equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && name.equals(employee.name) && location.equals(employee.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, location);
    }


    // parametrised constructor


    public Employee(String name, double salary, String loction) {
        this.name = name;
        this.salary = salary;
        this.location = loction;
    }

    //getter setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
