package Loop_working;

public class PrimeNumber_Assignment {

    public static void main(String[] args) {

        //check the number is prime or not.
        int number=40;
        boolean flag=true;
        for (int i=2; i<number; i++){
            if(number%i==0){
                flag=false;

            }

        }
        if(flag) {
            System.out.println("the Number is prime " + number);
        }
        else{
            System.out.println("the Number is not prime " + number);
        }
    }
}
