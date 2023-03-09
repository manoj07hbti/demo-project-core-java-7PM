package method_or_function;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        // reading String value in Scanner Class :-

        System.out.println("Please Enter Your Name");
        Scanner scannerObj = new Scanner(System.in);
        String Name = scannerObj.nextLine();
        System.out.println("This is your name: "+Name);

        // reading Int value in Scanner Class :-

        System.out.println("Please Enter Your Age");
        int age = scannerObj.nextInt();
        System.out.println("It is your age: "+age);

        // reading Decimal value in Scanner Class :-

        System.out.println("Please Enter Your Income");
        double salary = scannerObj.nextDouble();
        System.out.println("It is your salary: "+salary);
    }
}
