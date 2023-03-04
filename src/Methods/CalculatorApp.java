package Methods;

import java.util.Scanner;

public class CalculatorApp {
    public int Add(int a, int b){
        int sum = a+b;
        return sum;
    }
    public int Sub(int a, int b){
        int Sub = a-b;
        return Sub;
    }
    public int Mul(int a, int b){
        int Mul = a*b;
        return Mul;
    }
    public double Div(int a, int b){
        double Div = (double)a/b;
        return Div;
    }

    public static void main(String[] args) {
        int flag=0;
        while(flag==0){
            System.out.println("Please Enter value of a : ");
            Scanner obj = new Scanner(System.in);
            int a = obj.nextInt();

            System.out.println("Please Enter value of a : ");
            int b = obj.nextInt();

            System.out.println("Enter 1 for Addition, 2 for Sub, 3 for Mul, 4 for Devision");
            int choice = obj.nextInt();

            CalculatorApp r = new CalculatorApp();
            if(choice==1) {
                int result = r.Add(a, b);
                System.out.println("Sum of " + a + " and " + b + " is " + result);
            }
            if(choice==2) {
                int result = r.Sub(a, b);
                System.out.println("Sub of " + a + " and " + b + " is " + result);
            }
            if(choice==3) {
                int result = r.Mul(a, b);
                System.out.println("Mul of " + a + " and " + b + " is " + result);
            }
            if(choice==4) {
                double result = r.Div(a, b);
                System.out.println("Div of " + a + " and " + b + " is " + result);
            }
            Scanner newobj = new Scanner(System.in);
            System.out.println("Do you want to continue : Press 0 to continue or Press any Number to Exit");
            flag= newobj.nextInt();
        }
    }
}
