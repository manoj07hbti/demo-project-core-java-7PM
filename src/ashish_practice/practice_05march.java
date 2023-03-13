package ashish_practice;
import java.util.Scanner;
public class practice_05march {
    public static void main(String[] args) {
        int start, end;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        start = sc.nextInt();
        System.out.print("Enter ending number : ");
        end = sc.nextInt();
        System.out.print("Prime numbers are : ");
        for (int j = start; j <= end; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    flag = false;
                    break;
                }
                else {
                    flag = true;
                }
            }
            if (flag == true) {
                System.out.print(j + " ");
            }

//        System.out.print("Enter starting number : ");
//        Scanner sc = new Scanner(System.in);
//        start = sc.nextInt();
//        System.out.print("Enter ending number : ");
//
//        end = sc.nextInt();
//        System.out.println("prime numbers : ");
//        for (int j = start; j <= end; j++) {
//            for (int i = 2; i < j; i++) {
//                if (j % i == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag == true) {
//                System.out.print(j);
//            }
//        }
        }
    }
}