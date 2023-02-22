package opps.inheritance.abstraction;

public class demoChild extends demoAbstraction{
    @Override
    public void m2() {
        System.out.println("This is m2 method");
    }

    @Override
    public void m3() {
        System.out.println("This is m3 method");

    }

    public static void main(String[] args) {
        System.out.println("this is main method");
        demoChild obj = new demoChild();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
