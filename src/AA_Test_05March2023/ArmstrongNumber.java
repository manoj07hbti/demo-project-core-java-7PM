package AA_Test_05March2023;

import java.util.Scanner;
class ArmstrongNumber{
    public static void main(String[] arg)
    {
        int a,arm=0,n,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        temp=n;
            while (n!=0){
            a=n%10;
            arm=arm+(a*a*a);
            n/=10;
        }
        if(arm==temp)
            System.out.println(temp+" is a armstrong number ");
        else
            System.out.println(temp+" is not a armstrong number ");
    }
}