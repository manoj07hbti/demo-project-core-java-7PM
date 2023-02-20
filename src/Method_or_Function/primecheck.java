package Method_or_Function;
import java.util.Scanner;

public class primecheck {
    public void prime(int number) {
        int i;
        boolean flag = false;
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = true;
                break;
            }

        }
        if (flag == true) {
            System.out.println("Number is not  prime");
        } else {
            System.out.println("Number is prime");

        }
    }

    public static void main(String[] args) {
        int j=1;

        while (j == 1){

            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter number to check the prime or not : ");
            int number = sc.nextInt();
            primecheck obj1 = new primecheck();
            obj1.prime(number);
            System.out.println("To continue the program press : 1");
            System.out.println("To stop the program press : 0");
            j= sc.nextInt();
        }
    }
}
