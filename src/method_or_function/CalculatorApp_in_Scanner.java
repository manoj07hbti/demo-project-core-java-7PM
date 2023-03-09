package method_or_function;

import java.util.Scanner;

public class CalculatorApp_in_Scanner {

    public int add(int a, int b) {

        int add = a + b;

        return add;
    }

    public int sub(int a, int b) {

        int sub = a - b;

        return sub;
    }

    public int mul(int a, int b) {

        int mul = a * b;

        return mul;
    }

    public double divide(int a, int b) {

        double divide = (double) a / b;

        return divide;
    }

    public static void main(String[] args) {

        int repeat = 0;

        while (repeat == 0) {

            System.out.println("Enter value of A");
            Scanner scannerObj = new Scanner(System.in);
            int a = scannerObj.nextInt();

            System.out.println("Enter value of B");
            int b = scannerObj.nextInt();

            System.out.println("Chose:- 1=ADD,2=SUB,3=MULTI,4=DIVIDE");
            int chose = scannerObj.nextInt();


            CalculatorApp_in_Scanner obj = new CalculatorApp_in_Scanner();

            if (chose == 1) {

                int add = obj.add(a, b);
                System.out.println("Add is:- " + add);
            }
            else if (chose == 2) {

                int sub = obj.sub(a, b);
                System.out.println("Subtract is:- " + sub);
            }
            else if (chose == 3) {

                int mul = obj.mul(a, b);
                System.out.println("Multiply is:- " + mul);
            }
            else if (chose == 4) {

                double divide = obj.divide(a, b);
                System.out.println("Divide is:- " + divide);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("ON=0 AND OFF=ANY NUMBER");
            repeat = scanner.nextInt();

        }


    }
}

