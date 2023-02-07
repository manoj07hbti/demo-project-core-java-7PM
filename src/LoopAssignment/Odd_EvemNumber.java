package LoopAssignment;

public class Odd_EvemNumber {

    public static void main(String[] args){
        // find the even number from 1 to 100

        int number=100;
        System.out.println("list of even number from 1 to "+number);

        for(int i=1; i<=number; i++){

            if(i%2==0){
                System.out.println(""+i);
            }
        }
        // find odd number from 1 to 100
        int odd_number=100;

        System.out.println("list of odd number from 1 to "+odd_number);
        for(int j=1; j<=odd_number; j++){
            if(j%2!=0){
                System.out.println(+j);
            }
        }

    }
}
