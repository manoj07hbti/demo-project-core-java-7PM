package method_or_function;

public class DemoA {

    public void m1(){
        System.out.println("M1");
        DemoA obj= new DemoA();
        obj.m2();

    }
    public void m2(){
        DemoA obj= new DemoA();
        System.out.println("M2");
        obj.m3();
    }
    public void m3(){
        System.out.println("M3");
    }
    public void m4(){
        System.out.println("M4");
    }
    public void m5(){
        System.out.println("M5");
    }


    public static void main(String[] args) {

        DemoA obj= new DemoA();

        obj.m1();



    }
}
