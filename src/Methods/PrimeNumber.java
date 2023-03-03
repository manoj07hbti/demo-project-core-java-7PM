package Methods;

public class PrimeNumber {

    public void prime(int number){
        boolean flag= false;

        for(int i=2;i<number/2;i++) {
            if (number % i == 0) {
                flag=true;
                break;
            }
            else{
               flag= false;
            }
        }
        if (flag==false)
            System.out.println("Prime no.");
        else
            System.out.println("Not prime");
    }

    public static void main(String[] args) {
        PrimeNumber p=new PrimeNumber();
        p.prime(36);
    }
}
