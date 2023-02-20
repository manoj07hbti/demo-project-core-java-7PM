package method_or_function;

import java.util.Scanner;

public class DemoBankAccountOpening {


    public void openAccount(double amount){

        if(amount>=5000){

            System.out.println("Account is created Successfully , Please collect your ATM from Manager");
        }
        else {

            System.out.println("Account is not created due to less balance deposited , please deposit 5000 to Open account");
        }


    }


    public static void main(String[] args) {

        Scanner scannerObj= new Scanner(System.in);

        System.out.println("Please enter Amount to deposit for Account Opening :");
        double amount = scannerObj.nextDouble();

        DemoBankAccountOpening obj= new DemoBankAccountOpening();

        obj.openAccount(amount);



    }

}
