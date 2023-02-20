package Method_or_Function;
import java.util.Scanner;

public class primeNumber {
    public boolean prime(int number) {
        int i;
        boolean x;
        boolean flag = false;
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = true;
                break;
            }

        }
        if (flag == true) {
//            System.out.println("Number is not  prime");
            x= false;
        } else {
//            System.out.println("Number is prime");
            x= true;

        }
        return x;
    }

    public static void main(String[] args) {
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number : ");
        int a = sc.nextInt();
        System.out.print("Enter End number : ");
        int b = sc.nextInt();
        System.out.print("prime numbers between " +a +" and " +b +" are : "  );
        while ( a<= b){
            primeNumber obj1 = new primeNumber();
            boolean p = obj1.prime(a);
            if (p== true ){
                System.out.print(a + ", ");
            }
            a++;

        }
    }
}
