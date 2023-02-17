package method_or_fuction;

import java.util.Scanner;

public class Opining_Account {

    public String  name(){

        String name = "Gaurav";
         return name;

    }
    public String phoneNo(){

        String phoneNo="7500139385";
        return phoneNo;

    }
    public String accountNo(){

        String accountNo="3245356586769221";
        return accountNo;

    }
    public String address(){

        String address="Agra";
        return address;

    }
    public static void main(String[]ar){

        System.out.println("Please Entered Your Name");

        Scanner scannerObj = new Scanner(System.in);
        String name=scannerObj.nextLine();

        System.out.println("Please Entered Phone Number  : ");
        String  phoneNo  = scannerObj.nextLine();

        System.out.println("Please Entered Account Number : ");
        String accountNo= scannerObj.nextLine();


        System.out.println("Please Entered Address : ");
        String address = scannerObj.nextLine();

         String  choice=scannerObj.nextLine();

        Opining_Account obj = new Opining_Account();

        if(choice=="name"){

            String result= obj.name();
            System.out.println("Account Opining Holder Name "+result);

        } else if (choice=="phoneNo") {

            String result = obj.phoneNo();
            System.out.println("Account Holder Phone Number "+result);

        } else if (choice=="account") {

            String result = obj.accountNo();
            System.out.println("Account Holder Account Number "+result);

        } else if (choice=="address") {

            String result = obj.address();
            System.out.println("Account Holder Address "+result);

        }

    }











}
