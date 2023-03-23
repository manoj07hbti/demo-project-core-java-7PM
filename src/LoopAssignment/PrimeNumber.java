package LoopAssignment;

public class PrimeNumber {

    public static void main(String[] args){

        // find the prime number from 1 to 50
        int i = 0;
        int num=0;
        String primenumber="";
      // System.out.println("list of prime number from 1 to 50");

        for ( i=1; i<=50; i++){
            int counter=0;
            for(num=i; num>=1; num--) {
                if (i % num == 0) {// % this sign is use for remainder
                                   // divided sign is / and use for divide
                    counter = counter + 1;
                }
            }
            if(counter==2){
               primenumber= primenumber + i + " ";
            }

        }
        System.out.println("Print prime numbers 1 to 50");
        System.out.println(primenumber);
    }
}
