package Oops.Inheritance.Abstraction.polymorphism;

public class Child_Class extends Parent_Class {
        public static void main(String args[]){

            Parent_Class obj=new Parent_Class();

             obj.m1();

             obj.m2(16);

        }

    @Override
    public void m1(){

        System.out.println("this is m1 method");
    }

    public void m2(int age){

        System.out.println("this is m2 method of Child class" + age);
    }















}
