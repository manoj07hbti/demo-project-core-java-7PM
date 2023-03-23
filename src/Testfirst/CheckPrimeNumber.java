package Testfirst;

import java.util.*;
public class CheckPrimeNumber {
    //Q write a program to check6 number is prime or not take input from user

    public void primeNumber(){
        String coice = "y";// first of all check string data is equal to y or not
        while (coice.equals("y")){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number");// first of all enter a number
            int num = sc.nextInt();// enter value is integer or not
            // int num = 10;
            int temp= 0; // temp is a variable key  which equal to zero
            int m = num/2;   // m is half of enter number and then after
            for(int i=2; i<=m; i++) {  // start the loop i is equals to zero and condition of i is greater them m
                if (num % i == 0) { // remainder is equals to zero then print
                    System.out.println("this is not prime number"+num);
                    temp=1; // because temp value is not equal to 0 then loop will be stopped and execute
                    break;
                }
            }
            if(temp== 0){ // then the value of temp is equal to zero
                System.out.println("prime number"+num);
            }
            System.out.println("press y for continue and other key for exit");
            Scanner sc1 = new Scanner(System.in); // make new scanner method for coice variable
            coice =sc1.nextLine();
        }
    } public static void main(String [] args){
        CheckPrimeNumber obj = new CheckPrimeNumber();
        obj.primeNumber();
    }


}



