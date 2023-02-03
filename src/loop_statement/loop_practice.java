package loop_statement;
import java.util.Scanner;

public class loop_practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int a= sc.nextInt();
        System.out.print("Enter ending number : ");
        int b= sc.nextInt();
        int i=100;
        while (a<=b){
            System.out.println("Number = " +a);
            a++;
            }
        }
    }

