package Test_01;
import java.util.Scanner;
public class cube_test {
    public int cube(int num){
        int result;
        result = num* num*num;
        return result;

    }
    public static void main(String[] args) {
        System.out.println("write a method which make cube of number and return");

        System.out.print(" to calculate cube,  Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        cube_test obj = new cube_test();
        int cube_result = obj.cube(a);
        System.out.println("Result  : " +cube_result);
    }
}
