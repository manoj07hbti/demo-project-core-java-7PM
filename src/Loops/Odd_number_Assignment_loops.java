package Loops;

public class Odd_number_Assignment_loops {

    public static void main(String[] args) {

        //Write a program to find the odd numbers 1 tp 100//

        int i = 1;
        int number = 100;
        while (i <= number) {
            if (i % 2 != 0) {
                System.out.println("Odd number :" + i);
            }
            i++;
        }

    }
}
