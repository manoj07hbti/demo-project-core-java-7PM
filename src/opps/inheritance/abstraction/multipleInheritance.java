package opps.inheritance.abstraction;

public class multipleInheritance extends DemoParent1 implements Demoparent2{
    @Override
    public void m4() {
        System.out.println("This is m4 method of demoparent interface");
    }

    @Override
    public void m3() {
        System.out.println("This is m3 method of demoparent interface");

    }
}
