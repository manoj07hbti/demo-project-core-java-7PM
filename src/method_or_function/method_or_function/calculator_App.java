package method_or_function.method_or_function;

import java.util.Scanner;

public class calculator_App {

    public static void main(String args[]) {

        Scanner scannerobj = new Scanner(System.in);

        int flag = 1;

        while (flag == 1) {

            System.out.println("Please enter value of a:");

            int a = scannerobj.nextInt();

            System.out.println("Please enter value of b:");
            int b = scannerobj.nextInt();

            System.out.println("Please enter your choice :1  for Addition 2 for Subtract 3 for Multiply 4 for  double Divide");

            int choice = scannerobj.nextInt();

            calculator_App obj = new calculator_App();

            if (choice == 1) {

                int result = obj.add(a, b);
                System.out.println("Addition Is : " + result);
            } else if (choice == 2) {

                int result = obj.subtract(a, b);
                System.out.println("Subtract is :" + result);
            } else if (choice == 3) {

                int result = obj.multiply(a, b);
                System.out.println("multiply is" + result);
            } else if (choice == 4) {

                double result = (double) obj.divide(a, b);
                System.out.println("Division is" + result);
            }

            Scanner scanner = new Scanner(System.in);

            System.out.println("Do you want to continue? press 1 to continue and press any other number to exit");

            flag = scanner.nextInt();
        }

    }

    public int add(int a, int b) {

        int sum = a + b;

        return sum;
    }

    public int subtract(int a, int b) {

        int sub = a - b;

        return sub;
    }

    public int multiply(int a, int b) {

        int multi = a * b;

        return multi;
    }

    public double divide(int a, int b) {

        double divi = (double) a / b;

        return divi;
    }
}



