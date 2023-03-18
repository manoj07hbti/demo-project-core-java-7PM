package opps.polymorphism.overriding;

public class DemoOverridingParent {

    protected void m1(){
        System.out.println("Overriding normal Method");
    }

    public DemoOverridingParent m2(){
        System.out.println("Co variant Method");

        return new DemoOverridingParent();
    }
}
