package oops.inheritance.abstraction;

public class ChildInterface  implements DemoInterface{
    @Override
    public void m1() {

        System.out.println("This is M1 method ");
    }

    @Override
    public void m2() {
        System.out.println("This isM2 method ");
    }
}
