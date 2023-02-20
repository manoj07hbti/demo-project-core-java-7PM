package method_or_function;

import java.util.Scanner;

public class Demo_Scanner {

    public static void main(String[] args) {
        // reading string values

        System.out.println("Please enter your name :");

        // Step 1 create object of scanner class

        Scanner scannerObj = new Scanner(System.in);
        String name = scannerObj.nextLine(); // it reads String input and return
        System.out.println("You have entered name as :" + name);

        // reading int values

        System.out.println("Please enter your age :");
        int age = scannerObj.nextInt(); // it reads integer values
        System.out.println("You have entered age as :" + age);

        // reading decimal values

        System.out.println("Please enter your salary...");
        double salary = scannerObj.nextDouble(); // it reads decimal values
        System.out.println("You entered salary as :" + salary);


    }
}
