package method_or_function;

import java.util.Scanner;

public class CalculatorAppWithValue {
    public int add(int a, int b){
        int add=a+b;
        return add;
    }
    public int subt(int a, int b){
        int subt=a-b;
        return subt;
    }
    public int multi(int a, int b){
        int multi=a*b;
        return multi;
    }
    public double divide(double a, double b){
        double divide=a/b;
        return divide;
    }

    public static void main(String[] args) {

        Scanner Calcobj = new Scanner(System.in);
        int flag = 0;
        while (flag == 0) {

            System.out.println("please enter the value of a");
            int a = Calcobj.nextInt();

            System.out.println("please enter the value of b");
            int b = Calcobj.nextInt();

            System.out.println("please enter your choice: 1 for Add, 2 for subt , 3 for multi , 4 for divide");
            int choice = Calcobj.nextInt();


            CalculatorAppWithValue obj = new CalculatorAppWithValue();
            if (choice == 1) {
                int result = obj.add(a, b);
                System.out.println("sum is " + result);
            } else if (choice == 2) {
                int result = obj.subt(a, b);
                System.out.println("subt is:" + result);
            } else if (choice == 3) {
                int result = obj.multi(a, b);
                System.out.println("Multi is :" + result);
            } else if (choice == 4) {
                double result = obj.divide(a, b);
                System.out.println("Divide is" + result);
            }
            Scanner scanner= new Scanner(System.in);

            System.out.println("Do you want to continue ?   press 0 to continue or press any other number to exit ");

            flag=scanner.nextInt();


        }
    }

}
