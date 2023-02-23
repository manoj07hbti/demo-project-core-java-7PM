package inhertanceMethod;

public class ClassB extends ClassA {

    public void m2(){
        System.out.println("this is a bag");
    }
    public void m3(){
        System.out.println("this is m3 method");
    }
    public static void main(String [] args){
        ClassB obj= new ClassB();
        obj.m1();
    }
}
