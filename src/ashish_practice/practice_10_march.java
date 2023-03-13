package ashish_practice;
import java.util.Scanner;
public class practice_10_march {
    public static void main(String[] args) {
        int number[]= new int[200];
        int i;
        Scanner sc = new Scanner(System.in);
        for ( i=0; i<=199; i++){
            number[i]= (i+1);
        }
        for (int element:number){
            if (element%2==0) {
                System.out.print(element + " ");
            }
        }
//        System.out.println();

    }
}
