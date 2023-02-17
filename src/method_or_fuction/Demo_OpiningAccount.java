package method_or_fuction;

import java.util.Scanner;

public class Demo_OpiningAccount {

    public String name (String name ){

        if(name=="Raj"){
            System.out.println("Account Holder Name");
        }
        else {
            System.out.println("Invalid Account Holder Name");
        }
        return name;
    }
    public String phoneNo(String phoneNo){

        if(phoneNo=="7500139285"){
            System.out.println("Account Holder Phone Number ");
        }
        else {
            System.out.println("Invalid Account Holder Phone Number ");
        }
        return phoneNo;
    }
    public String accountNo(String accountNo){

        if(accountNo=="2345345678679087"){
            System.out.println("Account Holder Account Number ");
        }
        else {
            System.out.println("Invalid Account Holder Account number");
        }
        return accountNo;

    }
    public String address(String address ){

        if(address=="Agra"){
            System.out.println("Account Holder Address ");
        }
        else {
            System.out.println("Invalid Account Holder Address ");
        }
        return address;
    }

    public static void main(String[]args){

        System.out.println("Please Entered Your Name : ");

        Scanner scannerObj = new Scanner(System.in);
        String name = scannerObj.nextLine();

        System.out.println("Please Entered Your Phone Number : ");
        String phoneNo = scannerObj.nextLine();

        System.out.println("Please Entered Your Account Number : ");
        String accountNo = scannerObj.nextLine();

        System.out.println("Please Entered Address : ");
        String address = scannerObj.nextLine();

        Demo_OpiningAccount obj = new Demo_OpiningAccount();

        obj.name(name);
        obj.phoneNo(phoneNo);
        obj.accountNo(accountNo);
        obj.address(address);



    }



}
