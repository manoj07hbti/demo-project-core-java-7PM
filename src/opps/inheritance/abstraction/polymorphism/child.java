package opps.inheritance.abstraction.polymorphism;

public class child extends parent{
    public void m1(){
        System.out.println("This is m1 method of child class");
    }

    public static void main(String[] args) {
        child obj = new child();
        obj.m1();
    }
}
