package tests;

import java.util.Scanner;

public class PrimeNumber {
    public void prime(int number){
        boolean flag=false;
        for(int i=2;i<number/2;i++){
            if(number%i==0){
                flag=false;
                break;
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
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();

        PrimeNumber p= new PrimeNumber();
        p.prime(result);
    }
}
