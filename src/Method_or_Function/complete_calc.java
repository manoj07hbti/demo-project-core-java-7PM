package Method_or_Function;
import java.util.Scanner;

public class complete_calc {
    public int add(int a, int b){
        int sum;
        sum = a+ b;
        return sum;

    }
    public int sub(int a, int b){
        int sub;
        sub = a- b;
        return sub;
    }
    public double divide(int a, int b){
        double div;
        div = (double) a/b;
        return div;
    }
    public double multiply(int a, int b){
        double multipl;
        multipl = (double) a*b;
        return multipl;
    }
    public int square(int a){
        int square;
        square = a*a;
        return square;
    }
    public double percentage(int a, int b){
        double per;
        per = (double) a*b;
        per = per/100.0;
        return per;
    }


    public static void main(String[] args) {
        System.out.println("press number to start operation:");
        System.out.println("1 : Addition");
        System.out.println("2 : substraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : divide");
        System.out.println("5 : Square");
        System.out.println("6 : percentage");
        System.out.print(" Select option : ");
        Scanner sc = new Scanner(System.in);
        int d= sc.nextInt();
        switch (d){
            case 1:

                complete_calc addition = new complete_calc();
                System.out.print("Enter first number : ");
                int f1= sc.nextInt();
                System.out.print("Enter second number : ");
                int s1= sc.nextInt();

                int result1= addition.add(f1,s1 );
                System.out.println("Addition = "+result1);
                break;
            case 2:
                complete_calc substration = new complete_calc();
                System.out.print("Enter first number : ");
                int f2= sc.nextInt();
                System.out.print("Enter second number : ");
                int s2= sc.nextInt();

                int result2= substration.sub(f2,s2 );
                System.out.print("Substration = "+result2);
                break;
            case 3:
                complete_calc Multiplication = new complete_calc();
                System.out.print("Enter first number : ");
                int f3= sc.nextInt();
                System.out.print("Enter second number : ");
                int s3= sc.nextInt();

                double result3= Multiplication.multiply(f3,s3 );
                System.out.println("Multiplication = "+result3);
                break;
            case 4:
                complete_calc divide = new complete_calc();
                System.out.print("Enter first number : ");
                int f4= sc.nextInt();
                System.out.print("Enter second number : ");
                int s4= sc.nextInt();
                double result4= divide.divide(f4,s4 );
                System.out.println("divide = "+result4);
                break;
            case 5:
                complete_calc square = new complete_calc();
                System.out.print("Enter number : ");
                int f5= sc.nextInt();
                int result5= square.square(f5);
                System.out.println("square = "+result5);
                break;
            case 6:
                complete_calc percentage = new complete_calc();
                System.out.print("Enter number : ");
                int f6= sc.nextInt();
                System.out.print("Enter per number : ");
                int s6= sc.nextInt();
                double result6= percentage.percentage(f6,s6 );
                System.out.println("percentage = "+result6);
                break;
            default:
                System.out.println("Entered number is invalid");
                break;
        }
    }

}
