package method_or_function.method_or_function;

import java.util.Scanner;

public class OpeningAccountBank {


    public static void main(String args[]){

        Scanner scannerobj  =new Scanner(System.in);

        System.out.println("Please enter amount for BanK Account");

        double amount=scannerobj.nextDouble();

        OpeningAccountBank obj=new OpeningAccountBank();

           obj.BankAccount(amount);






    }

    public void BankAccount(double amount){

       if(amount>=7000){

           System.out.println("Account is created successfully ");
       }
       else {

           System.out.println("Account is not created successfully");
       }
    }
}
