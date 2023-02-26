package opps.inheritance.abstraction.polymorphism;

public class demoMethodoverloading {
    public void m1(){
        System.out.println("This is m1 method without input parameter");
    }
    public void m1(int age){
        System.out.println("This is m1 method with integer input parameter   age : " +age);
    }
    public void m1(int age, String name){
        System.out.println("This is m1 method with integer and string type input parameter  age" +age + "name :" +name);
    }
    public void m1(String city){
        System.out.println("This is m1 method with string type input parameter");
    }

    public static void main(String[] args) {
        System.out.println("Let's print m1 method with parameters");
        demoMethodoverloading obj1 = new demoMethodoverloading();
        obj1.m1();
        obj1.m1(5);
        obj1.m1(5,"ashish");
        obj1.m1("ashish");
    }
}
