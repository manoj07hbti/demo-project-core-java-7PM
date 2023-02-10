package method_or_function.method_or_function;

public class Employee {
    //info,work ,getsalary

    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    private void infoMethod(){

        System.out.println("this is info Method of Employee class");
    }
    private void workMethod(){

        System.out.println("this is work Method of Employee class");
    }
     private void getsalaryMethod(){

        System.out.println("this is getsalary Method of Employee class ");
     }
       public static void main(String args[]){

        // className objectName =new className();

           Employee obj =new Employee();


           //obj.MethodName();

            obj.infoMethod();

            obj.workMethod();

            obj.getsalaryMethod();







       }











}
