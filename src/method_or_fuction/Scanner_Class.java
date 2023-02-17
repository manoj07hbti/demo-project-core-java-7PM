package method_or_fuction;

import java.util.Scanner;

public class Scanner_Class {

    public static void main(String[]ar){

    // printing  reading string value //

        System.out.println("Please Enter Your Name ");

    // create object scanner class //

        Scanner scannerObj = new Scanner(System.in);

        String name= scannerObj.nextLine();

        System.out.println("You Have Entered Name : "+name);

    // printing age value //
        System.out.println("Please Entered Your Age : ");
        int age = scannerObj.nextInt();
        System.out.println("You Have Entered Age : "+age);

    // printing decimal value //
        System.out.println("Please Entered Your Salary : ");

        double salary = scannerObj.nextDouble();
        System.out.println("You Have Entered Salary : "+salary);




    }





}
