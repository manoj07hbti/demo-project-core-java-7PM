package Method_obje;

public class Employee {

    // SYNTEX: Employee: info / work / getsalary

    public void info(){
        System.out.println("information about to employee");

    }
    private void work(){
        System.out.println("what do employee do work");

    }
    public void get_salary(){
        System.out.println("what do employee take salary ");
    }

    public static void main(String [] args){

        Employee obj= new Employee();
        obj.info();
        obj.work();
        obj.get_salary();
    }
}
