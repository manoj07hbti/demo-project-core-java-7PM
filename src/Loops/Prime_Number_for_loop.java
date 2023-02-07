package Loops;

public class Prime_Number_for_loop {
    public static void main(String[] args) {

        //Write a program to find prime numbers//

        int number = 6;
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println(number + " : is a prime number..");
        } else {
            System.out.println(number + " : is not a prime number..");
        }

    }
}
