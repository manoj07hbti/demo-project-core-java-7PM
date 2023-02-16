package ashish_practice;
import java.sql.SQLOutput;
import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        int []marks = new int[5];
        int min= 0;
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<=4; i++){
            System.out.print("Enter next number : ");
            int a= sc.nextInt();
            marks[i] = a;
        }
        min = marks[0];
        for (int i=1; i<=4; i++){
            if (min>marks[i]){
                min = marks[i];
            }
        }
        System.out.println("minimum number is   = " +min);
    }
}
