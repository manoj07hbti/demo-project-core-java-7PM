package method_or_fuction;

public class Employee {



    //       Syntax : access_specifier return_type  method_name (parameter) {CODE..} //

    public void Info(){
        System.out.println("This Is Information Method In Employee Class");

    }

    protected void Work(){
        System.out.println("This IS Work Method In Employee Class");

    }

     private void Getsalay(){
        System.out.println("This IS GetSalary  Methods In Employee Class");

    }

    public static void main(String[]args){

        Employee obj = new Employee();

        obj.Getsalay();

        obj.Info();

        obj.Work();


    }

    }

