package opps.polymorphism.overriding;

public class DemoOverridingChild extends DemoOverridingParent{
    @Override
    public void m1(){
        System.out.println("Method Overridden");
    }

    public DemoOverridingChild m2(){
        System.out.println("Co variant Overridden");

        return new DemoOverridingChild();
    }

    public static void main(String[] args) {
        DemoOverridingChild obj= new DemoOverridingChild();
        obj.m1();
        obj.m2();
    }
}
