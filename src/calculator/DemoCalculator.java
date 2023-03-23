package calculator;
import java.util.*;
public class DemoCalculator {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter value of a");
        int a =sc.nextInt();
        System.out.println("enter value of b");
        int b= sc.nextInt();
        System.out.println("enter value of c");
        int c= sc.nextInt();
        int sum= a+b+c;
        System.out.println(sum);

    }
}