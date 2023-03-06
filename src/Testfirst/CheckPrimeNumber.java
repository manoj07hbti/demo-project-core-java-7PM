package Testfirst;
import java.util.*;
public class CheckPrimeNumber {
    //Q write a program to check6 number is prime or not take input from user

    public void PrimeNumber(int num) {
        int i, m = 0, flag = 0;

        m = num / 2;
        if (num == 0 || num == 1) {
            System.out.println(num + "is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (num % i == 0) {
                    System.out.println(num + "is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num + "is prime number");
            }
        }


    }

    public static void main(String [] args){
        CheckPrimeNumber obj = new CheckPrimeNumber();

        obj.PrimeNumber(3);

    }

}
