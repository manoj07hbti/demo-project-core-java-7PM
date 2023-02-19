package method_or_function;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        System.out.println("Please enter your name : ");

        Scanner scannerobj=new Scanner(System.in);
        String name=scannerobj.nextLine();
        System.out.println("you have entered name as : " +name);

        System.out.println("please enter your age : ");
        int age=scannerobj.nextInt();
        System.out.println("you have enter your age as :" +age);

        System.out.println("salary is : ");
        double salary=scannerobj.nextDouble();
        System.out.println("you have enter your salary is : "  +salary);


    }
}
