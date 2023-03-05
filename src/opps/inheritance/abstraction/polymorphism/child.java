package opps.inheritance.abstraction.polymorphism;

public class child extends parent{
    public void m1(){
        System.out.println("This is m1 method of child class");
    }

    public static void main(String[] args) {
        parent obj = new parent();
        obj.m1();
        parent obj1 = new child();
        obj1.m1();

    }
}
