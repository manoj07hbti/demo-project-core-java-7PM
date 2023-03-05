package core_java_test;

import java.util.Scanner;

public class Prime_number {

    //Write a program to check Prime Number or not Prime Number//

    public void primeNumber(int number) {
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;

            }
        }
        if (flag) {
            System.out.println("This number is Prime Number");
        } else {
            System.out.println("This number is not a Prime Number");
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Prime_number obj = new Prime_number();
        obj.primeNumber(number);
    }
}
