package LoopAssignment;

public class Check_ArmstrongNumber {

    public static void main(String [] args){

        int number = 371;
        int originalNumber;
        int remainder;
        int result=0;
        originalNumber= number;

        while(originalNumber !=0){
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if (result == number){
            System.out.println(number+ " this is armstrong number ");
        }
        else{
            System.out.println(number+ " this is not armstrong number ");
        }

    }
}
