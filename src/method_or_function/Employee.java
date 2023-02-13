package method_or_function;

public class Employee {

    //info , work , getsalary;
    //  Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    private void infoMethod(){
        System.out.println("This is info Method of Employee Class");
    }
    private void workMethod(){
        System.out.println("This is work method of Employee Class");
    }
    private void getsalaryMethod(){
        System.out.println("This is getsalary Method of Employee Class");
    }

    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.infoMethod();
        obj.workMethod();
        obj.getsalaryMethod();

    }
}
