package Testfirst;
import java.util.*;
public class CheckPrimeNumber {
    //Q write a program to check number is prime or not take input from user

    public static boolean PrimeNumber(int num){
        if (num<=1){
            return false;
        }
        for (int i=1; i<Math.sqrt(num); i++){
            if (num%i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){

        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a Number");

        int num= obj.nextInt();
        if (PrimeNumber (num)){
            System.out.println(num+ " this is not prime number");
        }
        else{
            System.out.println(num+ "this is prime number");
        }
    }

}
