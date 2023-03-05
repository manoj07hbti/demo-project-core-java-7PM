package Tests;

import java.util.Scanner;

public class PalindromeNumber {
    public void Palindrome(int number){
        int temp,result=0,digit;
        temp=number;
        while(number>0) {
            digit = number % 10;
            result=result*10+digit;
            number/=10;
        }
        if (result==temp)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
    }

    public static void main(String[] args) {
        PalindromeNumber p=new PalindromeNumber();
        System.out.println("Please Enter Number to Check");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        p.Palindrome(num);
    }
}
