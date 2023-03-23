package Testfirst;
import java.util.*;
public class CheckPalidromsNum {
    public static void main(String[] args){
        //Q write a program to check palindrome of number

        int r;
        int sum=0;
        int temp;
        int number=121;
        temp=number;
        while (number>0){
            r= number%10; // it's remainder here like 121%10=1
            sum= (sum*10)+r;
            number= number/10; // here it's divide like 121/10=12
        }
        if (temp==sum){
            System.out.println("this is palindrome number ");
        }
        else{
            System.out.println("this is not palindrome number");
        }

    }

}

