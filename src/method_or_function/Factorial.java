package method_or_function;

public class Factorial {

    //SYNTAX: access_specifier return_type method_name(Parameter){CODE}
    public void factorial(int num) {
        int i, fact = 1;

        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        obj.factorial(5);
        obj.factorial(10);
        obj.factorial(19);
    }


}
