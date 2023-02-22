package opps.inheritance;

public class Demo_B extends Opps_demo_A {

    protected void m4() {
        System.out.println("This is Protected method of Opps Inheritance..");
    }

    public static void main(String[] args) {
        Demo_B obj = new Demo_B();
        obj.opps();// it calls Opps_Demo_A class by the use of inheritance...
        obj.m3();
    }
}
