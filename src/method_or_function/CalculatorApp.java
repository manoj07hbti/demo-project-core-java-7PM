package method_or_function;

import java.util.Scanner;

public class CalculatorApp {

    public  int add(int a, int b){

        int sum=a+b;

        return sum;
    }

    public  int sub(int a, int b){

        int sub=a-b;

        return sub;
    }

    public int multi(int a, int b){

        int multi=a*b;

        return multi;
    }

    public double div(int a, int b){

        double div=(double) a/b;

        return div;
    }

    public static void main(String[] args) {

        Scanner scannerObj= new Scanner(System.in);

        int flag=0;

        while (flag==0){

            System.out.println("Please enter value of a:");

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

                int result =obj.sub(a,b);

                System.out.println("Subtraction is : "+result);
            }
            else if(choice==3){

                int result= obj.multi(a,b);
                System.out.println("Multiply  is "+result);
            }
            else if(choice==4){

                double result =obj.div(a,b);

                System.out.println("Division is :"+result);
            }

            Scanner scanner= new Scanner(System.in);

            System.out.println("Do you want to continue ?   press 0 to continue or press any other number to exit ");

            flag=scanner.nextInt();

        }




    }
}
