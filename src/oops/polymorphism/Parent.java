package oops.polymorphism;

public class Parent {

    public void m1(){

        System.out.println("This is m1 method of Parent class");
    }

    protected void m2(){

        System.out.println("This is protected method ");
    }

    private void m3(){

        System.out.println("This is protected method ");
    }


    public Parent covariant(){

        return new Parent();
    }




}
