package ashish_practice;
import java.sql.SQLOutput;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        float []marks = new float[5];
        float sum= 0;
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<=4; i++){
            System.out.print("Enter next number : ");
            float a= sc.nextFloat();
            marks[i] = a;
        }
        for (int i=0; i<=4; i++){
            sum = sum + marks[i];
        }
        System.out.println("Sum  = " +sum);
    }
}
