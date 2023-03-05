package AA_Test_05March2023;

import java.util.*;
class NumIsOrNotDivisibleBy3
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the Number:");
        num=sc.nextInt();
        if(num%3==0){
            System.out.println("The number entered is divisible by 3");
        }
        else
        {
            System.out.println("The number entered is not divisible by 3");
        }
    }
}