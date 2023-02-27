package oops.abstraction;

public abstract class DemoAbstraction {

    // normal method

    public void m1(){
        System.out.println("This is M1 Method ");
    }

    // abstract method access_specifier abstract return_type  method_name (parameter);

    public abstract void m2();
    public abstract void m3();

    public static void main(String[] args) {

      /*  DemoAbstraction obj= new DemoAbstraction(); // you can not create object of Abstract Class

        obj.m2();
        obj.m3();*/


    }

}
