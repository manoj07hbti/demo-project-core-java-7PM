package Conditional_statement;

public class Demoif_else {

    public static void main(String args[]){

        //Assignment 28 JAN

        //Syntax : if (condition){
        //          CODE
        //      }
        //      else{
        //      CODE
        //       }

        //Check any number is divisible by 5

        int num=565625;
        if(num%5==0){
            System.out.println("Number is  divisible by 5 : " );
        }
        else{
            System.out.println("Number is not divisible by 5 :" );
        }

        //Countary:India , then print India else Foreigner
        String CountryName="INDIA";
        if(CountryName=="JAPAN"){
            System.out.println("He is Indian : " +CountryName);
        }
        else{
            System.out.println("He is Foreigner :" +CountryName );
        }
    }
}
