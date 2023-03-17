package important_keywords;

public class DemoStatic {

    int age=25; // non static variable
    static String name="Rahul";// static variable
    public static void m1(){

        System.out.println("This is Static method of M1 "+name);
    }
    public static void m1(int marks){

        System.out.println("This is Static method of M1 "+marks);
    }

    public static void main(String[] args) {
        DemoStatic.m1(); // className.methodName();
        DemoStatic.m1(33);
    }
}
