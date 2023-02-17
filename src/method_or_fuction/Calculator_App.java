package method_or_fuction;

import java.util.Scanner;

public class Calculator_App {

    public int Add(int a, int b){

        int sum=a+b;

        return sum;

    }
    public int Sub(int a , int b ){

        int sub =a-b;
        return sub;

    }
    public int mul(int a, int b){

        int mul = a*b;

        return mul;

    }
    public double div(int a, int b ){

        int div = a/b;

        return div;

    }

    public static void main(String[]ar){

        System.out.println("Please Enter Value Of A :");

        Scanner scannerObj = new Scanner(System.in);
        int a= scannerObj.nextInt();

        System.out.println("Please Enter Value Of B : ");
        int b = scannerObj.nextInt();

        System.out.println("Please Enter Your Choice : 1 For Addition 2 For Subtraction 3 For Multiply 4 Divide");
        int choice=scannerObj.nextInt();

        Calculator obj = new Calculator();

        if(choice==1){
            int result =  obj.addMethod(a,b);
            System.out.println("Addition Is : "+result );
        } else if (choice==2) {

            int result= obj.Subtraction(a,b);
            System.out.println("Subtraction Is : "+result);

        } else if(choice==3) {

            int result = obj.Multiply(a,b);
            System.out.println("Multiply IS : "+result);
        } else if (choice==4) {

            double result = obj.divide(a,b);
            System.out.println("Divide IS "+result);
        }


    }








}
