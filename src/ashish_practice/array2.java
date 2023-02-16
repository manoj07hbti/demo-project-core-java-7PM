package ashish_practice;
import java.sql.SQLOutput;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int []marks = new int[5];
        int sum= 0;
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<=4; i++){
            System.out.print("Enter next number : ");
            int a= sc.nextInt();
            marks[i] = a;
        }
        System.out.println("Enter integer to search : ");
        int search = sc.nextInt();
        for (int i=0; i<=4; i++){
            if (search==marks[i]){
                System.out.println("number is available in array ");
                break;
            }
        }
    }
}


