package method_or_function.method_or_function;

import java.util.Scanner;

public class CreatedBankAccount {


     public static void main(String args[]){

        Scanner scannerobj =new Scanner(System.in);

        System.out.println("Please enter Created Bank Account");

        double amount =scannerobj.nextDouble();

         CreatedBankAccount obj=new CreatedBankAccount();

         obj.openBankAccount(amount);

     }

    public void openBankAccount(double amount){

        if(amount>=7000){

            System.out.println("Account  is created for succefully");
        }
        else{

            System.out.println("Account  is not created for succefully");
        }
    }
}


