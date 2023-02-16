package method_or_function;

import java.util.Scanner;

public class DemoScanner {


    public static void main(String[] args) {

        // reading string value

        System.out.println("Please enter your name : ");

        //STEP 1 create object of Scanner class

        Scanner scannerObj = new Scanner(System.in);
       String name= scannerObj.nextLine();// it reads String input and return

        System.out.println("You have entered name as : "+name);

        // reading int value

        System.out.println("Please enter your age: ");
        int age= scannerObj.nextInt();// it reads integer value and return

        System.out.println("You have entered age as : "+age);

        // reading decimal value

        System.out.println("Please enter your salary : ");
        double salary = scannerObj.nextDouble(); // it reads decimal values and return

        System.out.println("You have entered salary as  :"+salary);

    }
}
