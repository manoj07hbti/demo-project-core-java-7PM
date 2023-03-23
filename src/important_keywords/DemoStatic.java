package important_keywords;

public class DemoStatic {

    // static : it loads at compile time
    // with the help of this keyword you can call static method of class without creating object
    // ClassName.MethodName();


    public static void m1() {

        System.out.println("This is static method of m1...");

    }

    public static void m1(int marks) {

        //overloading is allowed in static method because it is == compile time polymorphism
        System.out.println("This is static method of m1..." + marks);

    }

    public static void main(String[] args) {
        DemoStatic.m1();// className.MethodName
        DemoStatic.m1(33);

    }
}
