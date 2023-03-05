package test;

import java.util.Scanner;

public class Calculator_app_test {
    public int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    public int subtract(int a, int b){
        int sub=a-b;
        return sub;
    }
    public int multi(int a,  int b) {
        int multply = a * b;
        return multply;
    }
public double divide(int a, int b){
        double div=a/b;
        return div;
    }

    public static void main(String[] args) {
        Scanner scannerobj=new Scanner(System.in);
        int flag=0;
        while (flag==0){
        System.out.println("please enter the number a :");
        int a= scannerobj.nextInt();
        System.out.println("please enter the number b : ");
        int b= scannerobj.nextInt();

        System.out.println("press 1 for add , press 2 for  subtract, press 3 for multiply, press 4 for  devide : ");
        int choice= scannerobj.nextInt();
        Calculator_app_test obj=new Calculator_app_test();
        if (choice==1){
            int result=obj.add(a,b);
            System.out.println("sum is : " +result);
        } else if (choice==2) {
            int result=obj.subtract(a,b);
            System.out.println("sub is : " +result);
        } else if (choice==3) {
            int result=obj.multi(a,b);
            System.out.println("multi iis : " +result);
        } else if (choice==4) {
            double result=obj.divide(a,b);
            System.out.println("devide is : "  +result);
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("press 0 to continue & press 1 for exit : ");
        flag= scanner.nextInt();
    }
}}
