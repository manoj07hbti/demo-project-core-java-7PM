package oops.inheritance.polymorphism;

public class DemoMethodOverLoading {

    public void m1(){

        System.out.println("THis is simple m1 method ");
    }

    // we have overloaded m1 with int age
    public void m1(int age){

        System.out.println("This is overloaded m1 method "+age);
    }

    // we have overloaded m1 with String age
    public void m1(String name){

        System.out.println("This is overloaded m1 method "+name);
    }

    // we have overloaded m1 with String age,String name
    public void m1(int age, String name){

        System.out.println("This is overloaded m1 method "+name + " Age : "+age);
    }



    public static void main(String[] args) {

        DemoMethodOverLoading obj= new DemoMethodOverLoading();
        obj.m1();
        obj.m1(33);
        obj.m1("Java");
        obj.m1(23,"Raj");
    }
}
