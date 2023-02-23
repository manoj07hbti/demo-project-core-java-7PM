package Oops.Inheritance.Abstraction;

public class DemoChild extends DemoAbstraction {


    public static void main(String args[]){

        DemoChild obj=new DemoChild();

        obj.Oops2();
        obj.Oops3();




    }

    @Override
    public void Oops2() {

        System.out.println("this is Oops2 Method");
    }

    @Override
    public void Oops3() {

        System.out.println("this is Oops3 Method");
    }









}
