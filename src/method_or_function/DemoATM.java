package method_or_function;

import java.util.Scanner;

public class DemoATM {

    public void checkPIN(int PIN){

        if(PIN==3333){

            System.out.println("Welcome to Bank ATM");
        }
        else {
            System.out.println("Incorrect PIN please try again");
        }

    }

    public static void main(String[] args) {

        System.out.println("Please enter your PIN :");

        Scanner scannerOb= new Scanner(System.in);

        int pin= scannerOb.nextInt();

        DemoATM obj= new DemoATM();

        obj.checkPIN(pin);

    }

}
