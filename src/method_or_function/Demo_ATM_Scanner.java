package method_or_function;

import java.util.Scanner;

public class Demo_ATM_Scanner {

    // write a code to check and validate ATM pin
    // if pin is correct 4444 : Welcome to bank ATM
    // wrong : incorrect PIN entered

    public void checkPin(int PIN) {

        if (PIN == 4444) {
            System.out.println("Welcome to bank ATM");
        } else {
            System.out.println("Incorrect PIN please try again..");
        }

    }

    public static void main(String[] args) {

        System.out.println("Please enter your PIN :");
        Scanner scannerObj = new Scanner(System.in);
        int PIN = scannerObj.nextInt();
        Demo_ATM_Scanner obj = new Demo_ATM_Scanner();
        obj.checkPin(PIN);


    }
}
