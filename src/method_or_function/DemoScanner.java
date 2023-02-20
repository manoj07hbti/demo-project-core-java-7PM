package method_or_function;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {
        //reading string values.
        System.out.println("Please enter your name :");

        //create object of scanner class
        Scanner scannerobj=new Scanner(System.in);
        String name=scannerobj.nextLine();   // nextline can store the string value
        System.out.println("Your name is  :"+name);

        //reading the int value
        System.out.println("please enter your age ");
        int age=scannerobj.nextInt();
        System.out.println("your age is " +age  );

        //reading the double value
        System.out.println("please enter the salary");
        double salary=scannerobj.nextDouble();
        System.out.println("your salary is : "+salary);

    }
}
