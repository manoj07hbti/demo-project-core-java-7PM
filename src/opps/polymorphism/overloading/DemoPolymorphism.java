package opps.polymorphism.overloading;


public class DemoPolymorphism {
    public void m1(){
        System.out.println("normal Method");
    }

    public void m1(String name){
        System.out.println("Overridden : "+name);
    }

    public static void main(String[] args) {
        DemoPolymorphism obj= new DemoPolymorphism();
        obj.m1();
        obj.m1("Praveen");
    }
}
