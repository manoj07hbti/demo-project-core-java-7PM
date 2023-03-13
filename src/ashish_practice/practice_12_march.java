package ashish_practice;
import java.util.Scanner;
public class practice_12_march {
    public static void main(String[] args) {
        int array1[] = new int[100];
        for (int i=0; i<100; i++){
            array1[i] = i+1;

        }
        System.out.println(" print array using advanced loop with odd number : ");
        for (int var: array1){
            if (var%2!=0){
                System.out.print(var + " , ");
            }
        }
        System.out.println("");
        System.out.println(" print array using advanced loop with even number : ");
        for (int var2: array1){
            if (var2%2==0){
                System.out.print(var2 + " , ");
            }
        }
    }
}
