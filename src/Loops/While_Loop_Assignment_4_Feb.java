package Loops;

public class While_Loop_Assignment_4_Feb {
    public static void main(String[] args) {

        //Assignment//
        // Write a program find even numbers 1 to 100//
        //SYNTAX:
        //while(condition){
        //                  looping statement
        //                  increment/decrement
        //                                       }

        int i;
        int number;
        i = 1;
        number = 100;

        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println("Even number :" + i);
            }
            i++;
        }

    }
}
