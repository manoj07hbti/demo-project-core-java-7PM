package Test_ScannerInput;

import java.util.Scanner;

import static java.sql.DriverManager.println;

public class EvenNumber {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number :");

        int number = sc.nextInt();

        if (number%2==0){
            System.out.println(number + " is  Even");
        }else{
            System.out.println(number +" is  odd ");
        }



        }



    }




















