package method_or_function;

import java.util.Scanner;

public class CalculatorApp {

    public  int add(int a, int b){

        int sum=a+b;

        return sum;
    }

    public int multi(int a, int b){

        int multi=a*b;

        return multi;
    }

    public static void main(String[] args) {

        System.out.println("Please enter value of a:");
        Scanner scannerObj= new Scanner(System.in);
        int a=scannerObj.nextInt();

        System.out.println("Please enter value of b: ");
        int b= scannerObj.nextInt();

        System.out.println("Please enter your choice : 1 for Addition, 2 for Subtraction , 3 for Multiply and 4 for divide");
        int choice=scannerObj.nextInt();

        CalculatorApp obj= new CalculatorApp();

        if(choice==1){

            int result= obj.add(a,b);

            System.out.println("SUM is "+result);
        }
        else if(choice==2){

            //CODE to call subtraction
        }
        else if(choice==3){

           int result= obj.multi(a,b);
            System.out.println("Multiply  is "+result);
        }





    }
}
