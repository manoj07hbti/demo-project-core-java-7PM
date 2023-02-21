package method_or_function;

import java.util.Scanner;
public class CalculatorApp {

    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public int subtract(int a, int b){
        int sub=a-b;
        return sub;
    }
    public int multiply(int a, int b){

        int multi=a*b;
        return multi;
    }
    public double devide(int a, int b){

        double div=(double) a/b;
        return div;
    }

    public static void main(String[] args) {
        Scanner scannerobj=new Scanner(System.in);
        int flag=0;
        while (flag==0){
        System.out.println("please enter the number a : ");
        int a =scannerobj.nextInt();
        System.out.println("please enter the code b :");
        int b=scannerobj.nextInt();

        System.out.println("please press 1 for Add, press 2 for Subtract, press 3 for Multiply, press 4 for Devide");
        int choice=scannerobj.nextInt();
        CalculatorApp obj=new CalculatorApp();
        if (choice==1){
            int result=obj.add(a,b);
            System.out.println("Sum is : "+result);
        } else if (choice==2) {
            int result=obj.subtract(a,b);
            System.out.println("Subtract is : " +result);
        } else if (choice==3) {
            int result=obj.multiply(a,b);
            System.out.println("Multiply is : "+result);
        } else if (choice==4) {
            double result=obj.devide(a,b);
            System.out.println("Devide is : " +result);
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("press 0 to continue & press 1 to exit");
        flag=scanner.nextInt();
    }
}
}