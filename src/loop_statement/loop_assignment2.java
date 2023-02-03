package loop_statement;

public class loop_assignment2 {
    public static void main(String[] args) {
        int fact = 1;
        int number= 7;
        for (int i = 1; i <= number; i++) {
            fact= fact*i;

        }
        System.out.println("Factorial of 7 = " +fact);

    }
}
