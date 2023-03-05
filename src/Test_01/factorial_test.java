package Test_01;
import java.util.Scanner;

public class factorial_test {
    public static void main(String[] args) {
        int fact=1;
        int i;
        Scanner sc= new Scanner(System.in);
        System.out.println("write a program to provie factorial of number");
        System.out.println("");
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        for (i=1; i<=num; i++){
            fact =fact*i;
        }
        System.out.println("Factorial of " +num + " is equal to : " +fact);
    }
}
