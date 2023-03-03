package Oops.Inheritance.Abstraction.polymorphism;

public class DemoOverloadingMethod {

    public static void main(String args[]){

        DemoOverloadingMethod obj=new DemoOverloadingMethod();

          obj.OverM1();
          obj.OverM1(6);
           obj.OverM1("Agra",5 );




    }

    public void OverM1(){

        System.out.println("this is simple m1 Method");
    }

    public void OverM1(int number){

        System.out.println("this is Overloading Method" + number);
    }

    public void OverM1(String city, int number){

        System.out.println("this is Overloading  "  + city + "number " +   number );

    }









    }













