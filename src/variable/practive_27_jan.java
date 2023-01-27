package variable;
import java.util.Scanner;

public class practive_27_jan {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc= new Scanner(System.in);
        boolean b1= sc.hasNextInt();
        System.out.println("entered number is integer or not: ");
        System.out.println("for integer: True    For not integer: false ");
        System.out.println(b1);
    }
}
