package method_or_fuction;

import java.util.Scanner;

public class CheckAtmPin{

    public int checkPin(int pin){

        if(pin==2345){

            System.out.println("Welcome To Bank Atm ");

        }
        else {
            System.out.println("Invalid Pin Please Try Again ");
        }
        return pin;
    }
    public static void main(String[]ar){

        System.out.println("Please Entered Your Pin ");


        Scanner scannerObj= new Scanner(System.in);
        int pin= scannerObj.nextInt();

        CheckAtmPin obj= new CheckAtmPin();

        obj.checkPin(pin);




    }


}





