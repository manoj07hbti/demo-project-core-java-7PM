package method_or_function.method_or_function;

import java.util.Scanner;

public class DemoCheckPin {

    public void CheckPin(int PIN) {

        if (PIN == 579) {

            System.out.println("Welcome to Bank");
        } else {

            System.out.println("Incorrect pin no entry");
        }
    }


    public static void main(String args[]) {

        System.out.println("Please enter pin :");

        Scanner  scannerobj=new Scanner(System.in);

             int pin = scannerobj.nextInt();

             DemoCheckPin obj=new DemoCheckPin();

              obj.CheckPin(pin);

    }




}
