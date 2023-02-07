package Loop_working;

public class FactorialOfSeven_Assignment_3Feb {

    public static void main(String[] args) {
        int fact = 1, number = 10;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is = " + fact);
    }


}
