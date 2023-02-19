package method_or_function;

import java.util.Scanner;

public class CalculatorApp {
    public int sum(int a, int b){
        int sum=a+b;
        return sum;
    }
    public int multi(int a, int b){
        int multi=a*b;
        return multi;
    }
    public int subtract(int a, int b){

        int sub=a-b;
        return sub;
    }

    public static void main(String[] args) {
        System.out.println("please enter a value of a :");
        Scanner scannerobj=new Scanner(System.in);
        int a=scannerobj.nextInt();

        System.out.println("please enter value of b :");
        int b=scannerobj.nextInt();
        System.out.println("sub is : ");

        System.out.println("please enter your choice : 1 for sum , 2 for sub , 3 for multi , 4 for devide");
        int choice=scannerobj.nextInt();
        CalculatorApp obj=new CalculatorApp();

        if (choice==1){
            int result=obj.sum(a,b);
            System.out.println("Sum is : " +result);
        } else if (choice==2) {
            int result=obj.subtract(a,b);
            System.out.println("Subtract is : " +result);
        } else if (choice==3) {
            int result=obj.multi(a,b);
            System.out.println("multi is : "+result);
        }
    }
}
