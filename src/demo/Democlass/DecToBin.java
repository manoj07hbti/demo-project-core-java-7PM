package demo.Democlass;
import java.util.*;

public class DecToBin {
    public static void main(String []args){
        int dec, quat, i=1, j;
        int bin[] = new int[100];
        Scanner scan= new Scanner(System.in);
        System.out.println("enter input decimal number");
        dec= scan.nextInt();
        quat=dec;
        while (quat!=0) {
            bin[i++] = quat % 2;
            quat = quat / 2;
        }
        System.out.println("this is binary number");

            for(j=i-1; j>0; j-- ) {
                System.out.print(bin[j]);
            }
            System.out.print("\n");
        }

}
