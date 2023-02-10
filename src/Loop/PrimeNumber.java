package Loop;

import java.util.Scanner;
class Check_Prime1{
    public static void main(String args[]){
        int num;
        boolean isPrime=false;

        num=29;
        int i=2;
        while( i<=num/2){

            //condition for non-prime
            if(num%i==0)
            {
                isPrime=true;
                break;
            }
            i++;
        }
        if(!isPrime){
            System.out.println(num+" is a prime numbner ");
        }
        else{
            System.out.println(num+" is not a prime numbner ");
        }
    }
}
