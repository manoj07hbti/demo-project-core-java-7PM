package OopsInheritance;

public class DemoA {

    private void m1(){
        System.out.println("this is m1 method for class DemoA");
    }
    public void m2(){
        System.out.println("this is m2 privet method for class DemoB & DemoC");
    }
    protected void m3(){
        System.out.println("this is m3 protected method for class DemoB & DemoC");
    }
    public void Child(){
        System.out.println("This method is only for child class");
    }

    public void GrandChild(){
        System.out.println("This method is only for grand child class");
    }

    public static void main(String[] args) {
        DemoA obj=new DemoA();
        obj.m1();

    }
          }