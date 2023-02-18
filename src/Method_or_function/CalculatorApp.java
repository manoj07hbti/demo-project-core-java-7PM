package Method_or_function;

import com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI;

import java.util.Scanner;

public class CalculatorApp {

    public int add(int a , int b){

        int add=a+b;
        return add;
    }

    public int subtract(int a , int b){

        int subtract=a-b;

        return subtract;

    }

    public int Multiply(int a , int b){

        int Multiply=a*b;

        return Multiply;
    }

    public int devide(int a , int b){

        int devide=a/b;

        return devide;
    }

    public static void main(String[] args) {

        System.out.println("please enter value of a: ");
        Scanner scannerobj=new Scanner(System.in);
        int a=scannerobj.nextInt();

        System.out.println("please enter value of b: ");
        int b=scannerobj.nextInt();

        System.out.println("please enter your choice: 1 for Addition, 2 for Subtract,  3 for Multiply, and 4 for Devide  ");

        int choice=scannerobj.nextInt();
        CalculatorApp obj= new CalculatorApp();

        if (choice==1){
            int result= obj.add(a,b);

            System.out.println("sum is  "+result);

        }
        else if(choice==2){
            int result= obj.subtract(a,b);

            System.out.println("subtract is "+result);
        }

        else if(choice==3){
            int result= obj.Multiply(a,b);

            System.out.println("multiply is  "+result);
        }

        else if(choice==4) {
            int result= obj.devide(a , b);

            System.out.println("devide is "+result);
        }

        }

    }






