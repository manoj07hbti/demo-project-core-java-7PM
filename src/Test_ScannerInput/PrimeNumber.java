package Test_ScannerInput;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int num = input.nextInt();

        boolean isPrime = true;

           if(num <= 1){

                isPrime = false;
           }else{
               for(int i = 2; i <= Math.sqrt(num);i++){
                   if(num % i ==0){
                       isPrime = false;
                       break;
                   }
               }
        }
         if(isPrime){

             System.out.println(num+" is a prime number");
         }
         else{
             System.out.println(num+" not a prime number");
         }






    }




}
