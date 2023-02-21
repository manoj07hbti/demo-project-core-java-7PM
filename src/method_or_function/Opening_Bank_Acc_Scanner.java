package method_or_function;

import java.util.Scanner;

public class Opening_Bank_Acc_Scanner {

    //Write a code to open account minimum balance 5000//  with the help of scanner....

    //access_specifier_return_type_ method _name (parameter) {CODE.........}

    public void openAccount(double amount) {

        if (amount >= 5000) {
            System.out.println("Account created successfully , Please collect your ATM from bank manager.. ");
        } else {
            System.out.println("Account is not created due to less balance deposited , Please deposited 5000 to open account..");
        }
    }

    public static void main(String[] args) {

        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Please enter the amount to deposit for Account Opening");
        double amount = scannerObj.nextDouble();
        Opening_Bank_Acc_Scanner obj = new Opening_Bank_Acc_Scanner();
        obj.openAccount(amount);


    }

}
