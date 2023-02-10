package javaAssignment;

public class WhileandDowhileloop {

    public static void main(String[] args){

        // print the even number 1 to 100
        // Use while loop and do while loop

        int number=100;
        //System.out.println("list of even number from 1 to "+number);

        //for(int i=1; i<=number; i++) {
            // logic for loop condition and if condition also use of this code

           // if(i%2==0){

               // System.out.println(i+" ");//
            //}
        //}
        // find the odd number from 1 to 100

        System.out.println("list of odd number from 1 to "+number);

        for(int j=1; j<=number; j++ ){
            if(j%2!=0){

                System.out.println(+j);
            }
        }
        // find the prime number from 1 to 50
        int prime= 50;
        System.out.println("list of prime number from 1 to "+prime);

        for(int k=1; k<=prime; k++){
            if(k%k==0){
                System.out.println(+k);
            }
        }

    }
}
