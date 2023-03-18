package opps.abstraction;

public class DemoAbstract extends DemoAbstraction{


    @Override
    public void m2() {
        System.out.println("Abstract method m1 from Parent Class");
    }

    @Override
    public void m3() {
        System.out.println("Abstract method m2 from Parent Class");
    }

    public static void main(String[] args) {
        DemoAbstract obj= new DemoAbstract();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
