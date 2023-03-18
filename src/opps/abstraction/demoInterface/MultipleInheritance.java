package opps.abstraction.demoInterface;

public class MultipleInheritance extends Parent2 implements Parent1{
    @Override
    public void m1() {
        System.out.println("Method of Interface");
    }

    public static void main(String[] args) {
        MultipleInheritance obj= new MultipleInheritance();
        obj.m1();
        obj.m2();
    }
}
