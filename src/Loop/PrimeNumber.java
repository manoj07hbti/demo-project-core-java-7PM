package Loop;

public class PrimeNumber {

    public static void main(String args[]){
        int number =8;

        boolean flag = true;

        for(int i =2;i <number;i++)

            if(number % i==0){

               flag = false;
            }
        
         if(flag){

             System.out.println("number is Prime number");
         }
         else{
             System.out.println("number is not prime number");
         }



    }

    }















