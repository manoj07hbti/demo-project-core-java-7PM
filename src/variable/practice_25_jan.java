package variable;
import java.util.Scanner;

public class practice_25_jan {
    public static void main(String[] args) {
        System.out.println("practice 25 Jan");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of subject 1 = ");
        int a= sc.nextInt();
        System.out.println("Enter marks of subject 2 = ");
        int b= sc.nextInt();
        System.out.println("Enter marks of subject 3 = ");
        int c= sc.nextInt();
        System.out.println("Enter marks of subject 4 = ");
        int d= sc.nextInt();
        System.out.println("Enter marks of subject 5 = ");
        int e= sc.nextInt();
        int sum= a+b+c+d+e;
        int per = (sum/5)/100;
        System.out.println("percentage of the numbers = " +per);

    }
}
