package LoopAssignment;

public class Check_palidromsNumber {

    public static void main(String[] args){

        // check palindroms number
        int r;
        int sum=0;
        int temp;
        int n= 225; // it is the number variable to be checked for palindroms number
        temp= n;

            while (n > 0) {
                r = n % 10; // getting remender
                sum = (sum * 10) + r;
                n = n / 10;
            }


        if(temp==sum){
            System.out.println("this is a palindroms number");
        }
        else{
            System.out.println("this is not a palindroms number");
        }

    }
}
