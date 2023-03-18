package opps.abstraction.demoInterface;

public class DemoImplement implements DemoInterface{


    @Override
    public void m1() {
        System.out.println("Method 1 of Interface");
    }

    @Override
    public void m2() {
        System.out.println("Method 2 of Interface");

    }

    public static void main(String[] args) {
        DemoImplement obj= new DemoImplement();
        obj.m1();
        obj.m2();
    }
}
