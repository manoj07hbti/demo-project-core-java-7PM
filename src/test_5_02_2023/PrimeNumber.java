package test_5_02_2023;

import java.util.Scanner;

public class PrimeNumber {


    //Write a program to find number is prime or not take input from User //

    int number = 15;
    public void prime(int number){
        boolean flag=false;
        for(int i=2;i<number/2;i++){
            if(number%i==0){
                flag=false;

            }

            else{

                flag=true;
            }

        }
        if(flag==true){

            System.out.println("Number is Prime Number");
        }

        else {

            System.out.println("Number is not a Prime Number");
        }
    }

    public static void main(String[] args) {

        System.out.println("Please Enter Number to check Prime number");

        Scanner gk = new Scanner(System.in);

        int result = gk.nextInt();

        PrimeNumber g= new PrimeNumber();
        g.prime(result);
    }
}










