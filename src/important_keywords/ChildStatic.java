package important_keywords;

public class ChildStatic extends  DemoStatic{

    public static void m1(){

        System.out.println("This is Child Static method of M1");
    }

    public static void main(String[] args) {
        ChildStatic.m1();
    }
}
