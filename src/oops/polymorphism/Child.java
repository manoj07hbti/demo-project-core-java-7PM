package oops.polymorphism;

public class Child extends Parent {

    @Override  // Annotation
    public void m1(){

        System.out.println("This is m1 method of Child  class");
    }

    public void m2(){

        System.out.println("This is protected method of Child ");
    }

    //Private methods can not be overridden
    /*@Override
    private void m3(){

        System.out.println("This is protected method ");
    }*/


    //3. Co variant return type

    @Override
    public Child covariant(){

        return new Child();
    }


    public static void main(String[] args) {

        Parent obj = new Parent();

        obj.m1();// it will call parent class method

        Parent obj1= new Child();

        obj1.m1();// it will call child class method

       /* Child obj2= new Parent();// compile time error

        obj2.m1();//*/

    }
}
