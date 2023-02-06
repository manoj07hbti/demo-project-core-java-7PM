package loops_working;

public class PrimeNumber {

    public static void main(String[] args) {

        int number= 15;

        boolean flag=true; // this is a variable of boolean type

        for(int i=2; i<number; i++){

            if(number%i ==0 ){

                flag=false;
            }


        }

        if(flag){
            System.out.println("Number is  prime number ..." +number);
        }
        else {
            System.out.println("Number is NOT  prime number ..." +number);
        }


    }
}
