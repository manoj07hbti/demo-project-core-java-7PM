package oops.inheritance.abstraction;

public class MultipleInheritance extends DemoParent1 implements DemoParent2 {
    @Override
    public void method1() {
        System.out.println("This is method of interface");
    }
}
