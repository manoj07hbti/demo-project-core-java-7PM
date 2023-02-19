package demo;

import variable.Whileloopdowhile;

import java.util.Scanner;

public class Calc {
    public int add(int a, int b) {
        int add = a + b;
        return add;
    }

    public int subtract(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public int multiply(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public int divide(int a, int b) {
        int div = a / b;
        return div;
    }

    public static void main(String[] args) {

        int choice=0;

        while (choice == 0) {
            System.out.println("Please select (1) for addition; (2) for Subtraction (3) for Multiplication (4) for Division (5) to Exit: ");
            Scanner scannerOps = new Scanner(System.in);
            int ops = scannerOps.nextInt();
            //choice=ops;

            if (ops==5){
                break;
            }
            System.out.println("Please enter value of a :");
            Scanner scannerObj = new Scanner(System.in);
            int a = scannerObj.nextInt();
            System.out.println("Please enter value of b:");
            int b = scannerObj.nextInt();
            Calc obj = new Calc();


            if (ops == 1 ) {
                int result = obj.add(a, b);
                System.out.println("Ans is " + result);
                choice=0;

            } else if (ops == 2) {
                //Code for subtracting two numbers

                int result = obj.subtract(a, b);
                System.out.println("Ans is " + result);
                choice=0;

            } else if (ops == 3) {

                int result = obj.multiply(a, b);
                System.out.println("Ans is " + result );
                choice=0;
            } else if (ops == 4) {
                int result = obj.divide(a, b);
                System.out.println("Ans is " + result);
                choice=0;
            }

        }

    }
}


