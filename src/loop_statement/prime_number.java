package loop_statement;
import javax.script.ScriptContext;
import java.util.Scanner;
public class prime_number {
    public boolean isPrime(int num) {
        boolean flag= true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }

        }
        return flag;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter last number : ");
        int last = sc.nextInt();
        //check for every number from 1 to N
        System.out.println("Prime numbers : ");
        prime_number obj = new prime_number();
        for (int j = start; j <= last; j++) {
            boolean flag2 = obj.isPrime(j);
            if (flag2 == true) {
                System.out.print(j + " , ");
            }
        }
    }
}

