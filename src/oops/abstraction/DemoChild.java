package oops.abstraction;

public class DemoChild extends DemoAbstraction{

    @Override
    public void m2() {

        System.out.println("This is M2 mehtod");
    }

    @Override
    public void m3() {
        System.out.println("This is m3 method ");

    }

    public static void main(String[] args) {

        DemoChild obj = new DemoChild();

        obj.m2();
    }
}
