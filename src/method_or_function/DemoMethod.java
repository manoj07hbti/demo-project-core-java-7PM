package method_or_function;

public class DemoMethod {


    /* todo    Member function or method -- capabilities
        Syntax : access_specifier return_type  method_name (parameter) {CODE..}
        ..
        access_specifier -> public , private , protected, default   THEORY PART
        return_type   -> output of function or method :  void : no return type
        method_name -> can be anything: it should be meaningful
        parameter ->  input parameter : optional*/

    //SYNTAX  : access_specifier return_type  method_name (parameter) {CODE..}

    public void m1(){

      System.out.println("This is m1 method");

    }

    public void m2(){

        System.out.println("This is m2 method");
    }


    public static void main(String[] args) {

        DemoMethod obj= new DemoMethod();
        obj.m1();

        obj.m2();
    }

}
