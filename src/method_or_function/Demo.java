package method_or_function;

import java.util.Scanner;

public class Demo {
    public int Sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public int Subtract(int a, int b){
        int sub=a-b;
        return sub;
    }
    public int multi(int a, int b){

        int multi=a*b;
        return multi;
    }
    public double devide(int a, int b){
        double devide=(double) a/b;
        return devide;
    }

    public static void main(String[] args) {
        Scanner scannerobj=new Scanner(System.in);
        int flag=0;
        while (flag==0){
            System.out.println("please enter the code a : ");
            int a =scannerobj.nextInt();
        System.out.println("please enter the code b : ");
        int b =scannerobj.nextInt();

    System.out.println("press 1 for sum, press 2 for devide, press 3 for multi & press 4 for devide");
    int choice=scannerobj.nextInt();
    Demo obj=new Demo();
    if (choice==1){
        int result=obj.Sum(a,b);
        System.out.println("Sum is : " +result);
    } else if (choice==2) {
        int result=obj.Subtract(a,b);
        System.out.println("Subtract is : " +result);
    } else if (choice==3) {
        int result=obj.multi(a,b);
        System.out.println("Multi is : " +result);

    } else if (choice==4) {
        double result=obj.devide(a,b);
        System.out.println("Divide is : " +result);
    }
    Scanner scanner=new Scanner(System.in);
    System.out.println("press 0 to continue & press 1 to exit");
    flag=scannerobj.nextInt();

        }
}}
