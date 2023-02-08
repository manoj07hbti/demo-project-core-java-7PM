package Armstrong_Palendrom;

public class PrimeNumber {
    public static void main(String[] args) {

        int number=6;
        boolean flag=true;

        for (int i=2; i<number; i++){
        if (number%i==0)
            flag=false;
        }
        if (flag){
            System.out.println("prime number is : " +number);
        }
        else {
            System.out.println("this is not prime number : " +number);
        }

    }


}
