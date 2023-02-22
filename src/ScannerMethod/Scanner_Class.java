package ScannerMethod;
import java.util.*;
    public class Scanner_Class {
   public void OpenAccount(double amount){
       if(amount>=2000){
           System.out.println("open your account");
       }else {
           System.out.println("not sufficient amount in your account ");
       }
   }
   public static void main(String[] args){
       Scanner scannerobj= new Scanner(System.in);
       int flag=0;
       while (flag==0) {
           System.out.println("please enter amount");
           double amount = scannerobj.nextDouble();
           Scanner_Class Obj = new Scanner_Class();
           Obj.OpenAccount(amount);
       }


   }
}
