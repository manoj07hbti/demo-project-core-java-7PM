package ashish_practice;
import java.sql.SQLOutput;
import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        int[][] str1 = new int[2][3];
        int[][] str2 = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print("Enter next number at : " + "[" + i + "]" + "[" + j + "]  = ");
                int a = sc.nextInt();
                str1[i][j] = a;
            }
        }
        System.out.println("Next string is : ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print("Enter next number at : " + "[" + i + "]" + "[" + j + "]  = ");
                int a = sc.nextInt();
                str2[i][j] = a;
            }
        }
        int[][] sum = new int[2][3];
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                sum[i][j] = str1[i][j] + str2[i][j];
            }
        }
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println("sum at  : " + "[" + i + "]" + "[" + j + "]  = " + sum[i][j]);
            }
        }
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(" "+sum[i][j] + " ");
            }
            System.out.println("");
        }
    }
}


