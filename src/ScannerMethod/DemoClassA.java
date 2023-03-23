package ScannerMethod;
import java.sql.SQLOutput;
import java.util.*;

public class DemoClassA {

    public static void main(String[] args) {
        int r, sum=0,temp;
        int i=121;
        while(i>0){
            r=i%10;
            sum=(sum*10)+r;
            i=i/10;
        }
        temp=i;
        if(temp==sum){
            System.out.println("number is palidrams number");
        }
        else {
            System.out.println("number is not palidrams number");
        }
    }
}
