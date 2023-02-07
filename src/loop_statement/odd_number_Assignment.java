package loop_statement;

public class odd_number_Assignment {
    public static void main(String[] args) {
        System.out.println("Using For Loop : ");
        int number = 100;
        int startingNumber = 1;
        for (startingNumber = 1; startingNumber <= number; startingNumber++) {
            if (startingNumber % 2 != 0) {
                System.out.println("Odd number : " + startingNumber);
            }
        }
        System.out.println();
        System.out.println("Using While Loop : ");
        int b = 100;
        int a = 1;
        while (a<=b){
            if (a % 2 != 0) {
                System.out.println("Odd number : " + a);
            }
            a++;

        }
    }
}
