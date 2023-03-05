package test_5_02_2023;

import java.util.Scanner;

public class Palendrom_number {


    public void Palendrome(int num){

        int temp,result=0,number;

        temp=num;

        while(num>0) {

            number = num % 10;

            result=result*10+number;

            num/=10;
        }

        if (result==temp)

            System.out.println("Number is Palindrome");

        else

            System.out.println("Number is not Palindrome");

    }

    public static void main(String[] args) {

        Palendrom_number g=new Palendrom_number();

        System.out.println("Please Enter Number to Check");

        Scanner gk = new Scanner(System.in);

        int num = gk.nextInt();

        g.Palendrome(num);
    }
}







