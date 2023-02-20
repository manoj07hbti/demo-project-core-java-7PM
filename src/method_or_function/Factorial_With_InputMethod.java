package method_or_function;

public class Factorial_With_InputMethod {
    public void factorial( int fact) {


        System.out.println("Factorial of given number " + fact);
        for (int i = fact; i >= 0; i--) {
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        Factorial_With_InputMethod obj=new Factorial_With_InputMethod();
        obj.factorial(10);

    }
}

