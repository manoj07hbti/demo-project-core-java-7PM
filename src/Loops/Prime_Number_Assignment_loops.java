package Loops;

public class Prime_Number_Assignment_loops {

    public static void main(String[] args) {

        //Write a program to find the prime numbers 1 to 50//

        int i;
        int number;
        i = 2;
        number = 50;
        while (i < number) {
            if (i % 2 != 0) {
                System.out.println("Prime number :" + i);
            }
            i++;
        }
    }
}
