package opps.inheritance;

public class demoA {
    public void m1(){ // can be shared to child classes
        System.out.println("This is method M1 of demoA class");
    }
    private void m2(){   // can not be shared to child classes
        System.out.println("This is private method m2 of demoA class");
    }
    protected void m3(){    // can be shared to child classes
        System.out.println("This is protected method m3 of demoB class");
    }
    public static void main(String[] args) {
        demoA obj1 = new demoA();
        obj1.m1();
        obj1.m2();
        obj1.m3();
    }
}
